class SolutionStringFunctions {

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}