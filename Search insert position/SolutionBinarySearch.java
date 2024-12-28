class SolutionBinarySearch {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while (left <= right) {
            if (target == nums[middle]) {
                return middle;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }

        if (target > nums[middle]) {
            return middle + 1;
        }

        return middle;
    }
}