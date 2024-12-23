class SolutionStrings {

    public boolean isPalindrome(int x) {
        String stringOfX = String.valueOf(x);
        String reverseOfX = new StringBuilder(stringOfX).reverse().toString();
        return stringOfX.equals(reverseOfX);
    }
}