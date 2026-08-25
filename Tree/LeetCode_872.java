import java.util.*;

public class LeetCode_872 {
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            helper(root1, l1);
            helper(root2, l2);
            if (l1.size() != l2.size())
                return false;
            for (int i = 0; i < l1.size(); i++) {
                if (!l1.get(i).equals(l2.get(i)))
                    return false;
            }
            return true;
        }

        void helper(TreeNode node, List<Integer> lst) {
            if (node == null)
                return;
            if (node.left == null && node.right == null) {
                lst.add(node.val);
                return;
            }
            helper(node.left, lst);
            helper(node.right, lst);
        }
    }
}
