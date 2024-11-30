class SolutionTwoIndexes {

    public int removeElement(int[] nums, int val) {
        int numberOfEncounters = 0;

        int startIndex = 0;
        int endIndex = nums.length - 1;

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }

        while (startIndex < endIndex) {
            if (nums[startIndex] == val && nums[endIndex] != val) {
                int temp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = temp;

                numberOfEncounters++;
                startIndex++;
                endIndex--;
            } else if (nums[startIndex] != val) {
                startIndex++;
            } else if (nums[endIndex] == val) {
                numberOfEncounters++;
                endIndex--;
            }
        }

        if (isValueInTheMiddle(startIndex, endIndex, nums, val)
            || areAllElementsEqualToValue(nums, val)) {
            numberOfEncounters++;
        }

        return  nums.length - numberOfEncounters;
    }

    private boolean isValueInTheMiddle(int startIndex, int endIndex, int[] nums, int val) {
        return startIndex == endIndex && nums[startIndex] == val;
    }

    private boolean areAllElementsEqualToValue(int[] nums, int val) {
        return nums[0] == val;
    }
}