import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

class SolutionFrequencyMap {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        BinaryOperator<Integer> remappingFunction =
            (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            };

        for (int num : nums) {
            frequencyMap.compute(num, remappingFunction);
        }

        return frequencyMap.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .orElse(new AbstractMap.SimpleEntry<>(0, 0))
            .getKey();
    }
}