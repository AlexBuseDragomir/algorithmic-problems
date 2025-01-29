class SolutionLowMid {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int low = Integer.MAX_VALUE;
        int mid = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < low) {
                low = num;
            } else if (num > mid && mid > low) {
                return true;
            } else if (num > low) {
                mid = num;
            }
        }

        return false;
    }
}