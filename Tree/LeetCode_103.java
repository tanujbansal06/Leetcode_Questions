import java.util.*;

public class LeetCode_103 {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            if (root == null) {
                return ans;
            }
            queue.offer(root);
            boolean ltr = true;
            while (!queue.isEmpty()) {
                List<Integer> lst = new ArrayList<>();
                int n = queue.size();
                for (int i = 0; i < n; i++) {
                    TreeNode node = queue.poll();
                    lst.add(node.val);
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                }
                if (ltr == false) {
                    Collections.reverse(lst);
                }
                ans.add(lst);
                ltr = !ltr;
            }
            return ans;
        }
    }
}
