import java.util.ArrayList;
import java.util.List;

public class LeetCode_113 {
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            hasPath(root, targetSum, new ArrayList<>(), ans);
            return ans;
        }

        public boolean hasPath(TreeNode root, int targetSum, List<Integer> lst, List<List<Integer>> ans) {
            if (root == null)
                return false;
            if (root.left == null && root.right == null) {
                if (root.val - targetSum == 0) {
                    lst.add(root.val);
                    ans.add(new ArrayList<>(lst));
                    lst.remove(lst.size() - 1);
                }
            }
            lst.add(root.val);
            boolean left = hasPath(root.left, targetSum - root.val, lst, ans);
            boolean right = hasPath(root.right, targetSum - root.val, lst, ans);
            lst.remove(lst.size() - 1);
            return left || right;
        }
    }
}
