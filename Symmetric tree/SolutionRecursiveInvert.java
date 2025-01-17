class SolutionRecursiveInvert {

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        right = invertTree(right);

        return areIdentical(left, right);
    }

    private boolean areIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.val == root2.val)
            && areIdentical(root1.left, root2.left)
            && areIdentical(root1.right, root2.right);
    }

    private TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}