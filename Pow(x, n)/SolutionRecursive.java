class SolutionRecursive {

    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE && (x < -1 || x > 1)) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x == -1 && n % 2 == 0) {
            return 1;
        }
        if (x == -1) {
            return -1;
        }
        return myPowRecursive(x, n);
    }

    public double myPowRecursive(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double half = myPowRecursive(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}