import java.util.*;

public class LeetCode_230 {
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
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> lst = new ArrayList<>();
            traverse(lst, root);
            return lst.get(k - 1);
        }

        void traverse(List<Integer> lst, TreeNode root) {
            if (root == null)
                return;
            traverse(lst, root.left);
            lst.add(root.val);
            traverse(lst, root.right);
        }
    }
}
