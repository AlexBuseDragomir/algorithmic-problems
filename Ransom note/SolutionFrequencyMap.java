import java.util.HashMap;
import java.util.Map;

class SolutionFrequencyMap {

    public boolean canConstruct(String ransomNote, String magazine) {
        final Map<Character, Integer> characterMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (characterMap.containsKey(ch)) {
                characterMap.put(ch, characterMap.get(ch) + 1);
            } else {
                characterMap.put(ch, 1);
            }
        }

        Integer chValue;

        for (char ch : ransomNote.toCharArray()) {
            chValue = characterMap.get(ch);
            if (chValue == null || chValue == 0) {
                return false;
            } else {
                characterMap.put(ch, chValue - 1);
            }
        }

        return true;
    }
}