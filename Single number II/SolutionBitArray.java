class SolutionBitArray {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] sumBits = new int[32];

        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                sumBits[31 - j] += num >> j & 1;
            }
        }

        int result = 0;

        for (int sumBit : sumBits) {
            if (sumBit % 3 == 0) {
                result = result * 2;
            } else {
                result = result * 2 + 1;
            }
        }

        return result;
    }
}