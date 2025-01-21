import java.util.ArrayDeque;
import java.util.Deque;

class SolutionStack {

    public int getMinimumDifference(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        TreeNode previous = null;
        int minDiff = Integer.MAX_VALUE;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (previous != null) {
                minDiff = Math.min(minDiff, Math.abs(current.val - previous.val));
            }
            previous = current;
            current = current.right;
        }

        return minDiff;
    }
}
