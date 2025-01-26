import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SolutionEfficient {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int element : arr) {
            if (occurrences.containsKey(element)) {
                occurrences.put(element, occurrences.get(element) + 1);
            } else {
                occurrences.put(element, 1);
            }
        }

        return occurrences.size() == new HashSet<>(occurrences.values()).size();
    }
}