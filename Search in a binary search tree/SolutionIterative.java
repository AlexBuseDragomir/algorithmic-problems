class SolutionIterative {

    public TreeNode searchBST(TreeNode root, int val) {
        while (true) {
            if (root == null) {
                return null;
            }

            if (root.val == val) {
                return root;
            }

            if (val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
    }
}