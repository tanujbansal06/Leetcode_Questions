import javax.swing.tree.TreeNode;

public class LeetCode_404 {
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
        public int sumOfLeftLeaves(TreeNode root) {
            return helper(root, root);
        }

        int helper(TreeNode node, TreeNode parent) {
            if (node == null)
                return 0;
            if (node.left == null && node.right == null) {
                if (parent.left == node)
                    return node.val;
            }
            parent = node;
            int left = helper(node.left, parent);
            int right = helper(node.right, parent);
            return left + right;
        }
    }
}
