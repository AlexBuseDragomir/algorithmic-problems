class SolutionBinarySearch {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        if (x == 2 || x == 3) {
            return 1;
        }

        if (x == Integer.MAX_VALUE) {
            return 46340;
        }

        int left = 1;
        int right = Math.min(x / 2 + 1, 46341);
        int middle = (left + right) / 2;

        while (true) {
            if (isMatch(middle, x)) {
                if (middle * middle > x) {
                    return middle - 1;
                }
                return middle;
            } else if (middle * middle < x) {
                left = middle;
                middle = (left + right) / 2;
            } else {
                right = middle;
                middle = (left + right) / 2;
            }
        }
    }

    private boolean isMatch(int middle, int x) {
        return middle * middle <= x && x < Math.min((long) (middle + 1) * (middle + 1), Integer.MAX_VALUE);
    }
}