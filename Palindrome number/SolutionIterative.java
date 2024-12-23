class SolutionIterative {

    public boolean isPalindrome(int x) {
        int originalX = x;

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        int reversed = x % 10;
        x = x / 10;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        return reversed == originalX;
    }
}