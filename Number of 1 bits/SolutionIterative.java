class SolutionIterative {

    private static final int MAX_POWER_2_LESS_THAN_MAX = 1_073_741_824;

    public int hammingWeight(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int count = 0;
        while (n > 0) {
            int powerOfTwoSmaller = getMaxPowerOfTwoSmaller(n);
            count++;
            n = n - powerOfTwoSmaller;
        }

        return count;
    }

    private int getMaxPowerOfTwoSmaller(int number) {
        if (number >= MAX_POWER_2_LESS_THAN_MAX) {
            return MAX_POWER_2_LESS_THAN_MAX;
        }

        int powerOfTwo = 1;

        while (number >= powerOfTwo) {
            powerOfTwo *= 2;
        }

        powerOfTwo /= 2;
        return powerOfTwo;
    }
}