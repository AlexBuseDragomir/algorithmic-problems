class SolutionIterative {

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        for (int i = index; i < nums.length; i++) {
            result[i] = 0;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}