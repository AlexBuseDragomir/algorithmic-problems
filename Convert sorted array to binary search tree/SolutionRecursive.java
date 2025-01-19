class SolutionRecursive {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        TreeNode root = new TreeNode();
        sortedArrayToBST(nums, 0, nums.length - 1, root);

        return root;
    }

    private void sortedArrayToBST(int[] nums, int start, int end, TreeNode node) {
        if (start > end) {
            return;
        }

        int middle = (start + end) / 2;
        node.val = nums[middle];
        node.left = start > middle - 1 ? null : new TreeNode();
        node.right = middle + 1 > end ? null : new TreeNode();

        sortedArrayToBST(nums, start, middle - 1, node.left);
        sortedArrayToBST(nums, middle + 1, end, node.right);
    }
}