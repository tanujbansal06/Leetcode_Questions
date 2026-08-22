import java.util.ArrayList;
import java.util.List;

public class LeetCode_257 {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            paths(root, ans, "");
            return ans;
        }

        void paths(TreeNode node, List<String> ans, String s) {
            if (node == null)
                return;
            s += node.val;
            if (node.left == null && node.right == null) {
                ans.add(s);
                return;
            }
            paths(node.left, ans, s + "->");
            paths(node.right, ans, s + "->");
        }
    }
}
