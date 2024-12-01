import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

class SolutionFrequencyMap {

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        BinaryOperator<Integer> remappingFunction =
            (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            };

        for (int i = 0; i < nums.length; i++) {
            frequencyMap.compute(nums[i], remappingFunction);
        }

        return copyOrderedMapToArray(frequencyMap, nums);
    }

    public int copyOrderedMapToArray(Map<Integer, Integer> map, int[] array) {
        int index = 0;
        for (Integer key : map.keySet()) {
            for (int i = 0; i < Math.min(map.get(key), 2); i++) {
                array[index++] = key;
            }
        }
        return index;
    }
}