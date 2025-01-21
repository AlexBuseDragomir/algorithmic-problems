class SolutionRecursive {

    private int minDiff = Integer.MAX_VALUE;
    private TreeNode previous = null;

    public int getMinimumDifference(TreeNode root) {
        dfsRecursive(root);
        return minDiff;
    }

    private void dfsRecursive(TreeNode current) {
        if (current == null) {
            return;
        }

        dfsRecursive(current.left);

        if (previous != null) {
            minDiff = Math.min(minDiff, Math.abs(current.val - previous.val));
        }
        previous = current;

        dfsRecursive(current.right);
    }
}
