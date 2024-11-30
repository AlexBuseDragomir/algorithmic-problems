class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        if (nums.length == 2) {
            if (nums[0] != nums[1]) {
                return 2;
            } else {
                return 1;
            }
        }

        int indexToInsert = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[indexToInsert] = nums[i];
                indexToInsert++;
            }
        }

        return indexToInsert;
    }
}