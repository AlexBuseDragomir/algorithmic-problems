class SolutionDfs {

    public TreeNode searchBST(TreeNode root, int val) {
        NodeHolder holder = new NodeHolder();
        searchBST(root, holder, val);
        return holder.getFound();
    }

    private void searchBST(TreeNode root, NodeHolder holder, int val) {
        if (root == null) {
            return;
        }

        if (root.val == val) {
            holder.setFound(root);
        }

        searchBST(root.left, holder, val);
        searchBST(root.right, holder, val);
    }

    private static final class NodeHolder {
        private TreeNode found;

        public TreeNode getFound() {
            return found;
        }

        public void setFound(TreeNode found) {
            this.found = found;
        }
    }
}