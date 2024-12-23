class SolutionIterative {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        // square root of max positive int is 46340.95
        for (long i = 1; i <= Math.min(x / 2 + 1, 46341); i ++) {
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