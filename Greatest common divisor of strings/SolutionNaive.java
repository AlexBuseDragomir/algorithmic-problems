class SolutionNaive {

    public String gcdOfStrings(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder builder = new StringBuilder();
        int index = 0;

        String maxPrefix = "";

        while (index < Math.min(chars1.length, chars2.length)) {
            if (chars1[index] != chars2[index]) {
                return maxPrefix;
            }

            builder.append(chars1[index++]);

            if (str1.length() % builder.length() != 0
                || str2.length() % builder.length() != 0) {
                continue;
            }

            if (isPrefix(builder, str1) && isPrefix(builder, str2)) {
                maxPrefix = builder.toString();
            }
        }

        return maxPrefix;
    }

    private boolean isPrefix(StringBuilder prefix, String str) {
        if (str.length() % prefix.length() != 0) {
            return false;
        }

        StringBuilder concatenated = new StringBuilder();
        while (concatenated.length() < str.length()) {
            concatenated.append(prefix);
        }

        return concatenated.toString().equals(str);
    }
}