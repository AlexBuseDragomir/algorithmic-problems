import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SolutionHashMap {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int j : arr) {
            occurrences.computeIfPresent(j, (key, value) -> value + 1);
            occurrences.putIfAbsent(j, 1);
        }

        return occurrences.size() == new HashSet<>(occurrences.values()).size();
    }
}