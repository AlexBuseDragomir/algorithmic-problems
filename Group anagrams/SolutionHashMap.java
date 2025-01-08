import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionHashMap {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortString(str);

            map.computeIfPresent(sortedStr, (key, value) -> {
                value.add(str);
                return value;
            });
            map.computeIfAbsent(sortedStr, k -> {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                return strings;
            });
        }

        return new ArrayList<>(map.values());
    }

    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}