class SolutionXor {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int unique = nums[0];

        for (int i = 1; i < nums.length; i++) {
            unique ^= nums[i];
        }

        return unique;
    }
}