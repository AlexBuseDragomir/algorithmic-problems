class SolutionIterative {

    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        StringBuilder result = new StringBuilder();

        int index1 = 0;
        int index2 = 0;

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        while (index1 < length1 && index2 < length2) {
            result.append(chars1[index1++]);
            result.append(chars2[index2++]);
        }

        while (index1 < length1) {
            result.append(chars1[index1++]);
        }
        while (index2 < length2) {
            result.append(chars2[index2++]);
        }

        return result.toString();
    }
}