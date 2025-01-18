import java.util.LinkedList;
import java.util.Queue;

class SolutionBreadthFirstSearch {

    public String breadthFirstSearch(TreeNode root) {
        if (root == null) {
            return "";
        }

        if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode current;
        TreeNode left = root.left;
        TreeNode right = root.right;

        StringBuilder result = new StringBuilder();
        result.append(root.val);
        result.append("[ROOT]");

        if (right != null) {
            queue.add(left);
        }
        if (left != null) {
            queue.add(right);
        }

        while (! queue.isEmpty()) {
            current = queue.poll();
            left = current.left;
            right = current.right;

            result.append(" -> ");
            result.append(current.val);

            if (current.left == null && current.right == null) {
                result.append("[LEAF]");
            }

            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }

        return result.toString();
    }
}