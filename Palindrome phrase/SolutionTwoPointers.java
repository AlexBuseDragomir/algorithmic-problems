class SolutionTwoPointers {

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        char startChar;
        char endChar;

        while (start <= end) {
            startChar = s.charAt(start);
            endChar = s.charAt(end);

            if (!Character.isLetterOrDigit(startChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                end--;
            } else if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}