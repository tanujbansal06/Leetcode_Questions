import java.util.*;

public class LeetCode_1008 {
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
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = new TreeNode(preorder[0]);
            for (int i = 1; i < preorder.length; i++) {
                makeBST(root, preorder[i]);
            }
            return root;
        }

        public void makeBST(TreeNode root, int val) {
            if (val < root.val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                } else {
                    makeBST(root.left, val);
                }
            }
            if (val > root.val) {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                } else {
                    makeBST(root.right, val);
                }
            }
        }
    }
}
