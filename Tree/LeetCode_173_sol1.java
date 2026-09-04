import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LeetCode_173_sol1 {

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

        List<Integer> lst = new ArrayList<>();
        int i = 0;

        public void inorder(TreeNode root) {
            if (root == null)
                return;
            inorder(root.left);
            lst.add(root.val);
            inorder(root.right);
        }

        public BSTIterator(TreeNode root) {
            inorder(root);
        }

        public int next() {
            return lst.get(i++);
        }

        public boolean hasNext() {
            return i < lst.size();
        }
    }
}
