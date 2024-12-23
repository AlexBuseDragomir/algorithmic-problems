class SolutionPreComputedPairs {

    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            Pair pair = getExponentSumUpToN(n);
            count += pair.count;
            n = n - pair.powerOfFive;
        }
        return count;
    }

    private Pair getExponentSumUpToN(int n) {
        if (n < 5) {
            return new Pair(n, 0);
        }

        if (3125 <= n) {
            return new Pair(3125, 781);
        } else if (625 <= n) {
            return new Pair(625, 156);
        } else if (125 <= n) {
            return new Pair(125, 31);
        } else if (25 <= n) {
            return new Pair(25, 6);
        } else {
            return new Pair(5, 1);
        }
    }

    private record Pair(int powerOfFive, int count) {}
}
