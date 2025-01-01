class SolutionFrequencyArray {

    public boolean canConstruct(String ransomNote, String magazine) {
        final int[] characterFrequency = new int[26];

        for (char ch : magazine.toCharArray()) {
            characterFrequency[ch - 'a'] = characterFrequency[ch - 'a'] + 1;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (characterFrequency[ch - 'a'] == 0) {
                return false;
            } else {
                characterFrequency[ch - 'a'] = characterFrequency[ch - 'a'] - 1;
            }
        }

        return true;
    }
}