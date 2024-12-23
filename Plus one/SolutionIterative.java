class SolutionIterative {

    public int[] plusOne(int[] digits) {
        int indexOfLast = digits.length - 1;
        int indexOfFirst = 0;

        if (digits[indexOfLast] != 9) {
            digits[indexOfLast] = digits[indexOfLast] + 1;
            return digits;
        }

        digits[indexOfLast] = 0;
        int carryOn = 1;

        int currentValue;
        for (int i = indexOfLast - 1; i >= 0; i--) {
            currentValue = digits[i] + carryOn;
            carryOn = currentValue == 10 ? 1 : 0;
            digits[i] = currentValue == 10 ? 0 : currentValue;
        }

        if (digits[indexOfFirst] == 0) {
            int[] digitsShifted = new int[digits.length + 1];
            System.arraycopy(digits, 0, digitsShifted, 1, digits.length);
            digitsShifted[indexOfFirst] = 1;

            return digitsShifted;
        }

        return digits;
    }
}