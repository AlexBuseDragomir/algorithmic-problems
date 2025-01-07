class SolutionArray {

    public boolean isAnagram(String s, String t) {
        final int[] sLetters = new int[256];

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            sLetters[ch] ++;
        }

        for (char ch : t.toCharArray()) {
            if (sLetters[ch] == 0) {
                return false;
            }
            sLetters[ch] --;
        }

        return true;
    }
}