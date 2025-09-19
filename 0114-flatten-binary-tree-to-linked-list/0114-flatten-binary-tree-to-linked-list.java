/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.Stack;

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            // Push right first so that left is processed first
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);

            // Rewire pointers
            if (!stack.isEmpty()) {
                curr.right = stack.peek();
            }
            curr.left = null; // left should always be null
        }
    }
}
