import javax.swing.tree.TreeNode;

public class LeetCode_1373 {

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
        int maxSum = 0;

        public int maxSumBST(TreeNode root) {
            find(root);
            return maxSum;
        }

        public int[] find(TreeNode root) {
            if (root == null) {
                return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1 };
            }

            int[] left = find(root.left);
            int[] right = find(root.right);

            boolean isBSTL = (left[3] == 1);
            boolean isBSTR = (right[3] == 1);
            boolean corr = left[1] < root.val && root.val < right[0];

            if (isBSTL && isBSTR && corr) {
                int sum = left[2] + root.val + right[2];
                maxSum = Math.max(maxSum, sum);
                int minimum = Math.min(left[0], root.val);
                int maximum = Math.max(right[1], root.val);

                return new int[] { minimum, maximum, sum, 1 };
            }

            return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0 };
        }
    }
}
