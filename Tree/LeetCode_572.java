import java.util.*;

public class LeetCode_572 {
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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (root == null)
                return false;
            if (isSame(root, subRoot)) {
                return true;
            }
            boolean left = isSubtree(root.left, subRoot);
            boolean right = isSubtree(root.right, subRoot);
            return left || right;
        }

        boolean isSame(TreeNode n1, TreeNode n2) {
            if (n1 == null && n2 == null)
                return true;
            if (n1 == null || n2 == null)
                return false;
            if (n1.val != n2.val)
                return false;

            boolean left = isSame(n1.left, n2.left);
            boolean right = isSame(n1.right, n2.right);
            return left && right;
        }
    }
}
