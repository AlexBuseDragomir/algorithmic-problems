import java.util.ArrayDeque;
import java.util.Deque;

class SolutionIterative {

    public String depthFirstSearch(TreeNode root) {
        if (root == null) {
            return "";
        }

        if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }

        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode topOfStack;
        TreeNode left = root.left;
        TreeNode right = root.right;

        StringBuilder result = new StringBuilder();
        result.append(root.val);
        result.append("[ROOT]");

        if (right != null) {
            stack.push(right);
        }
        if (left != null) {
            stack.push(left);
        }

        while (! stack.isEmpty()) {
            topOfStack = stack.pop();
            left = topOfStack.left;
            right = topOfStack.right;

            result.append(" -> ");
            result.append(topOfStack.val);

            if (topOfStack.left == null && topOfStack.right == null) {
                result.append("[LEAF]");
            }

            if (right != null) {
                stack.push(right);
            }
            if (left != null) {
                stack.push(left);
            }
        }

        return result.toString();
    }
}