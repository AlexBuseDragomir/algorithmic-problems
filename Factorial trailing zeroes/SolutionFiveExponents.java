class SolutionFiveExponents {

    public int trailingZeroes(int n) {
        int countFive = 0;

        if (n < 5) {
            return 0;
        }

        for (int number = 5; number <= n; number += 5) {
            countFive += getFiveDivisorExponent(number);
        }

        return countFive;
    }

    private int getFiveDivisorExponent(int number) {
        int count = 0;
        while (number % 5 == 0) {
            count++;
            number = number / 5;
        }
        return count;
    }
}