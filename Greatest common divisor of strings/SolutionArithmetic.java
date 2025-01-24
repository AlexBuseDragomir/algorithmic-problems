class SolutionArithmetic {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcdLength(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // Euclid largest common divisor
    private int gcdLength(int str1Length, int str2Length) {
        while (str2Length != 0) {
            int temp = str2Length;
            str2Length = str1Length % str2Length;
            str1Length = temp;
        }
        return str1Length;
    }
}