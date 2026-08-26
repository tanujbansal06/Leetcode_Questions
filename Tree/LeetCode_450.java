import java.util.*;

public class LeetCode_450 {
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else{
                int max = maxOfBST(root.left);
                root.left = deleteNode(root.left, max);
                root.val = max;
            }
        }
        return root;
    }

    public int maxOfBST(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int rmax = maxOfBST(root.right);
        return Math.max(rmax, root.val);
    }
}
}
