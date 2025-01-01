class SolutionOptimized {

    public boolean canConstruct(String ransomNote, String magazine) {
        final int[] characterFrequency = new int[26];

        for (char ch : magazine.toCharArray()) {
            characterFrequency[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (--characterFrequency[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}