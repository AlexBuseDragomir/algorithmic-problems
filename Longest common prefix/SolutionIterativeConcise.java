class SolutionIterativeConcise {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String longestPrefix = strs[0];
        String currentStr;

        for (int i = 1; i < strs.length; i++) {
            currentStr = strs[i];

            for (int j = 0; j < longestPrefix.length(); j++) {
                if (j > Math.min(longestPrefix.length() - 1, currentStr.length() - 1)
                    || longestPrefix.charAt(j) != currentStr.charAt(j)) {

                    longestPrefix = longestPrefix.substring(0, j);
                    break;
                }
            }
        }

        return longestPrefix;
    }
}