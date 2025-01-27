class SolutionArray {

    public int tribonacci(int n) {
        int[] result = new int[38];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;

        if (n < 3) {
            return result[n];
        }

        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result[n];
    }
}