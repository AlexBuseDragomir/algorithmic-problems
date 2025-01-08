import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionHashMapOptimized {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}