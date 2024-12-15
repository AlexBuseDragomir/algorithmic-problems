class SolutionAuxiliaryArray1 {

    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        if (k == 0 || nums.length == 1) {
            return;
        }

        int[] tail = new int[k];

        System.arraycopy(nums, nums.length - k, tail, 0, k);

        for (int i = nums.length - 1; i > k - 1; i --) {
            nums[i] = nums[i-k];
        }

        System.arraycopy(tail, 0, nums, 0, k);
    }
}