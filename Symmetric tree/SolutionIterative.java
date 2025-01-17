import java.util.LinkedList;
import java.util.Queue;

class SolutionIterative {

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root.left, root.right));

        TreeNode left;
        TreeNode right;

        while (!queue.isEmpty()) {
            Tuple removed = queue.poll();
            left = removed.left();
            right = removed.right();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.add(new Tuple(left.left, right.right));
            queue.add(new Tuple(left.right, right.left));
        }

        return true;
    }

    private record Tuple(TreeNode left, TreeNode right) {}
}
