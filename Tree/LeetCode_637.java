import java.util.*;

public class LeetCode_637 {
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> ans = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int n = queue.size();
                Double sum = 0.0;
                for (int i = 0; i < n; i++) {
                    TreeNode node = queue.poll();
                    sum += node.val;
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                }
                ans.add(sum / n);
            }
            return ans;
        }
    }
}
