import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SolutionHashMap {

    public boolean isIsomorphic(String s, String t) {
        final Map<Character, Character> characterMap = new HashMap<>();
        final Set<Character> mappedInT = new HashSet<>();

        char sChar;
        char tChar;

        for (int i = 0; i < t.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);

            if (characterMap.containsKey(sChar)) {
                if (characterMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (mappedInT.contains(tChar)) {
                    return false;
                } else {
                    characterMap.put(sChar, tChar);
                    mappedInT.add(tChar);
                }
            }
        }

        return true;
    }
}