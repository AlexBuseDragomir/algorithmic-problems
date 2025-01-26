import java.util.HashMap;
import java.util.Map;

class SolutionFunctional {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int element : arr) {
            occurrences.computeIfPresent(element, (key, value) -> value + 1);
            occurrences.putIfAbsent(element, 1);
        }

        return occurrences.values().stream().distinct().count() == occurrences.size();
    }
}