import java.util.ArrayList;
import java.util.List;

public class LeetCode_199 {
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
        int maxd = 0;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> lst = new ArrayList<>();
            rightView(root, lst, 1);
            return lst;
        }

        public void rightView(TreeNode node, List<Integer> lst, int level) {
            if (node == null)
                return;
            if (maxd < level) {
                maxd = level;
                lst.add(node.val);
            }
            rightView(node.right, lst, level + 1);
            rightView(node.left, lst, level + 1);
        }
    }
}
