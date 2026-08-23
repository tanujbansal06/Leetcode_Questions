import java.util.*;

public class LeetCode_563 {

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
        // int tilt =0;
        public int findTilt(TreeNode root) {
            // helper(root);
            // return tilt;
            return helper(root)[1];
        }

        // int helper(TreeNode node){
        // if(node == null) return 0;
        // int left = helper(node.left);
        // int right = helper(node.right);
        // tilt += Math.abs(left-right);
        // return left+right+node.val;
        // }

        int[] helper(TreeNode node) {
            if (node == null)
                return new int[] { 0, 0 };
            int[] left = helper(node.left);
            int[] right = helper(node.right);
            int sum = node.val + left[0] + right[0];
            int tilt = Math.abs(left[0] - right[0]) + left[1] + right[1];
            return new int[] { sum, tilt };
        }
    }
}
