class SolutionIterative {

    // square root of max positive int is 46340.95
    private static final int INTEGER_MAX_SQRT = 46340;

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        for (long i = 1; i <= Math.min(x / 2 + 1, INTEGER_MAX_SQRT + 1); i ++) {
            if ((i * i) == x) {
                return (int) i;
            }
            if (i * i > x) {
                return (int) (i - 1);
            }
        }

        return x;
    }
}