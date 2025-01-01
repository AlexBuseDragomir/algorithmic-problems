class SolutionLastIndex {

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

        int lastIndex = -1;

        for (char ch : s.toCharArray()) {
            int currentIndex = t.indexOf(ch, lastIndex + 1);
            if (currentIndex != -1) {
                lastIndex = currentIndex;
            } else {
                return false;
            }
        }

        return true;
    }
}