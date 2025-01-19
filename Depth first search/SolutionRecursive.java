class SolutionRecursive {

    public String depthFirstSearch(TreeNode root) {
        StringBuilder result = new StringBuilder();
        dfsRecursive(root, result);

        result.setLength(result.length() - 3);
        return result.toString();
    }

    private void dfsRecursive(TreeNode root, StringBuilder result) {
        if (root == null) {
            return;
        }

        if (result.isEmpty()) {
            result.append(root.val);
            result.append("[ROOT]");
        } else {
            result.append(root.val);
        }

        if (root.left == null && root.right == null) {
            result.append("[LEAF]");
        }

        result.append(" -> ");

        dfsRecursive(root.left, result);
        dfsRecursive(root.right, result);
    }
}