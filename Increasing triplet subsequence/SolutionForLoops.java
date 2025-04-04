class SolutionForLoops {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] < nums[k]) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}