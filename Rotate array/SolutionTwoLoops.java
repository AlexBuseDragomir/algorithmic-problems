class SolutionTwoLoops {

    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        if (k == 0 || nums.length == 1) {
            return;
        }

        int lastIndex = nums.length - 1;

        for (int i = 0; i < k; i ++) {
            int lastElement = nums[lastIndex];
            for (int j = lastIndex; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastElement;
        }
    }
}