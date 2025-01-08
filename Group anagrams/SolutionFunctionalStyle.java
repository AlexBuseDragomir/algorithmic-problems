import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

class SolutionFunctionalStyle {

    public List<List<String>> groupAnagrams(String[] strs) {
        final List<Map.Entry<String, int[]>> lettersList = new ArrayList<>();

        for (String str : strs) {
            final int[] letters = new int[26];

            for (char ch : str.toCharArray()) {
                letters[ch - 'a']++;
            }

            lettersList.add(Map.entry(str, letters));
        }

        return new ArrayList<>(lettersList
            .stream()
            .collect(groupingBy(
                entry -> Arrays.hashCode(entry.getValue()),
                mapping(Map.Entry::getKey, toList())
            ))
            .values());
    }
}