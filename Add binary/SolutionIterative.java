class SolutionIterative {

    public String addBinary(String a, String b) {
        if (a.equals("0")) {
            return b;
        }

        if (b.equals("0")) {
            return a;
        }

        StringBuilder result = new StringBuilder();

        boolean carry = false;

        char aVal;
        char bVal;

        int minSize = Math.min(a.length(), b.length());
        int maxSize = Math.max(a.length(), b.length());

        for (int i = 0; i < minSize; i++) {
            aVal = a.charAt(a.length() - i - 1);
            bVal = b.charAt(b.length() - i - 1);

            if (!carry) {
                if (aVal == '0') {
                    result.append(bVal);
                } else if (bVal == '0') {
                    result.append(aVal);
                } else if (aVal == '1' && bVal == '1') {
                    result.append('0');
                    carry = true;
                }
            } else {
                if (aVal == '0' && bVal == '0') {
                    result.append('1');
                    carry = false;
                } else if (aVal == '1' && bVal == '1') {
                    result.append('1');
                } else {
                    result.append('0');
                }
            }
        }

        if (a.length() != b.length()) {
            for (int i = minSize; i < maxSize; i++) {
                if (a.length() > b.length()) {
                    aVal = a.charAt(maxSize - i - 1);
                    carry = computeBitSum(result, carry, aVal);
                } else {
                    bVal = b.charAt(maxSize - i - 1);
                    carry = computeBitSum(result, carry, bVal);
                }
            }
        }

        if (carry) {
            result.append('1');
        }

        return result.reverse().toString();
    }

    private boolean computeBitSum(StringBuilder result, boolean carry, char value) {
        if (value == '0' && carry) {
            result.append('1');
            carry = false;
        } else if (value == '1' && carry) {
            result.append('0');
        } else if (value == '0') {
            result.append('0');
        } else {
            result.append('1');
        }
        return carry;
    }
}