class SolutionWhileLoop {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        while (n != 1) {
            if (n < 10 && n != 7) {
                return false;
            }
            n = calculateSumOfSquares(n);
        }

        return true;
    }

    private int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}