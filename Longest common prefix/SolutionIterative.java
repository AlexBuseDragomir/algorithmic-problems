class SolutionIterative {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String longestPrefix = strs[0];
        String currentStr;

        for (int i = 1; i < strs.length; i++) {
            currentStr = strs[i];

            for (int j = 0; j < longestPrefix.length(); j++) {
                if (currentIndexOverMinLastIndex(longestPrefix, currentStr, j)
                    || doesCurrentLetterDiffer(longestPrefix, currentStr, j)) {
                    longestPrefix = longestPrefix.substring(0, j);
                    break;
                }
            }
        }

        return longestPrefix;
    }

    private boolean currentIndexOverMinLastIndex(String str1, String str2, int index) {
        return index > Math.min(str1.length() - 1, str2.length() - 1);
    }

    private boolean doesCurrentLetterDiffer(String str1, String str2, int index) {
        return str1.charAt(index) != str2.charAt(index);
    }
}