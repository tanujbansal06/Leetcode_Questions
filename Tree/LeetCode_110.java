import java.util.*;
public class LeetCode_110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            return balanced(root).isBal;
        }

        public BalPair balanced(TreeNode root) {
            if (root == null) {
                return new BalPair();
            }
            BalPair lbp = balanced(root.left);
            BalPair rbp = balanced(root.right);
            BalPair sbp = new BalPair();
            sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
            int diff = Math.abs(lbp.ht - rbp.ht);
            sbp.isBal = lbp.isBal && rbp.isBal && diff <= 1;
            return sbp;
        }
    }

    class BalPair {
        int ht = -1;
        boolean isBal = true;
    }
}
