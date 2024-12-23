class SolutionIterative {

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
        return myPowIterative(x, n);
    }

    public double myPowIterative(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double pow = x;

        for (int i = 1; i < n; i++) {
            pow = pow * x;
        }

        return pow;
    }
}