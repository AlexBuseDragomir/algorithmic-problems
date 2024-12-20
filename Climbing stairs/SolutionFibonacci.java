class SolutionFibonacci {

    public int climbStairs(int n) {
        return getNFibonacciNumber(n + 1);
    }

    public int getNFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int temp;
        int previous = 1;
        int current = 1;

        for (int i = 3; i <= n; i ++) {
            temp = current;
            current = current + previous;
            previous = temp;
        }

        return current;
    }
}