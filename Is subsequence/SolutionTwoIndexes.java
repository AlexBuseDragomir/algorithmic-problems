class SolutionTwoIndexes {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }

        if (s.length() == t.length()) {
            return s.equals(t);
        }

        int sIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
            if (sIndex == s.length()) {
                break;
            }
        }

        return sIndex == s.length();
    }
}