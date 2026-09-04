import java.util.Stack;

import javax.swing.tree.TreeNode;

public class LeetCode_173_sol2 {

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

    class BSTIterator {

        Stack<TreeNode> st = new Stack<>();

        public void push(TreeNode root) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
        }

        public BSTIterator(TreeNode root) {
            push(root);
        }

        public int next() {
            TreeNode node = st.pop();
            if (node.right != null) {
                push(node.right);
            }
            return node.val;
        }

        public boolean hasNext() {
            return !st.isEmpty();
        }
    }

}
