class SolutionFloydsAlgorithm {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        int slow = n;
        int fast = calculateSumOfSquares(n);

        while (slow != fast) {
            if (fast == 1) {
                return true;
            }

            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        }

        return false;
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