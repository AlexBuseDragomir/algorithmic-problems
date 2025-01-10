class SolutionIterative {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int longestSequence = 1;
        int currentSequence = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSequence++;
            } else {
                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                }
                currentSequence = 1;
            }
        }

        if (currentSequence > longestSequence) {
            longestSequence = currentSequence;
        }

        return longestSequence;
    }
}