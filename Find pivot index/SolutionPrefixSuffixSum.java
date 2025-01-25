class SolutionPrefixSuffixSum {

    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}