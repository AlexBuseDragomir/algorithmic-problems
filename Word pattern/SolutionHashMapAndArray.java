import java.util.HashMap;

class SolutionHashMapAndArray {

    public boolean wordPattern(String pattern, String s) {
        final String[] mappingLetterToWord = new String[256];
        final HashMap<String, Character> mappingWordToLetter = new HashMap<>();

        final String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        char letter;
        String word;

        for (int i = 0; i < pattern.length(); i++) {
            letter = pattern.charAt(i);
            word = words[i];

            if (mappingLetterToWord[letter] != null) {
                if (!mappingLetterToWord[letter].equals(word)) {
                    return false;
                }
            } else {
                if (mappingWordToLetter.get(word) != null) {
                    return false;
                } else {
                    mappingLetterToWord[letter] = word;
                    mappingWordToLetter.put(word, letter);
                }
            }
        }

        return true;
    }
}