class SolutionAuxiliaryArray2 {

    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        if (k == 0 || nums.length == 1) {
            return;
        }

        int[] shiftedNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int indexInShiftedNums = shiftIndexKTimes(i, nums.length - 1, k);
            shiftedNums[indexInShiftedNums] = nums[i];
        }

        System.arraycopy(shiftedNums, 0, nums, 0, nums.length);
    }

    private int shiftIndexKTimes(int startIndex, int maxIndex, int k) {
        if (startIndex + k > maxIndex) {
            return startIndex + k - (maxIndex + 1);
        }
        return startIndex + k;
    }
}