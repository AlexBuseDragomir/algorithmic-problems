import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

class SolutionFrequencyMap1 {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.computeIfPresent(num, (key, value) -> value + 1);
            frequencyMap.putIfAbsent(num, 1);
        }

        return frequencyMap.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .orElse(new AbstractMap.SimpleEntry<>(0, 0))
            .getKey();
    }
}