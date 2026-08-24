import java.util.*;

public class LeetCode_671 {
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
        public int findSecondMinimumValue(TreeNode root) {
            int min = root.val;
            int ans = find(root, min);
            return ans;
        }

        int find(TreeNode root, int min) {
            if (root == null) {
                return -1;
            }
            if (root.val > min) {
                return root.val;
            }
            int left = find(root.left, min);
            int right = find(root.right, min);
            if (left == -1) {
                return right;
            }

            if (right == -1) {
                return left;
            }
            return Math.min(left, right);
        }
    }
}
