class SolutionNLogN {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countBitsForNumber(i);
        }
        return result;
    }

    public int countBitsForNumber(int n) {
        int count = 0;
        while (n != 0) {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }
}