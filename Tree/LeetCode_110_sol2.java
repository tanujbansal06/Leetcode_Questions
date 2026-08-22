import java.util.*;
public class LeetCode_110_sol2 {

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean isBalanced(TreeNode root) { 
        return ht(root) != -1;
    }
    int ht(TreeNode root){
        if(root == null) return 0;
        int left = ht(root.left);
        int right = ht(root.right);
        if(left == -1) return -1;
        if(right == -1) return -1;
        if(Math.abs(left-right) > 1) return -1;
        return Math.max(left,right)+1;
    }
}
}
