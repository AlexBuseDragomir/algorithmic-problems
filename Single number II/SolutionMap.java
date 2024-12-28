import java.util.HashMap;
import java.util.Map;

class SolutionMap {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            boolean containsNum = frequencyMap.containsKey(num);

            if (containsNum) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }

            if (frequencyMap.get(num) == 3) {
                frequencyMap.remove(num);
            }
        }

        return frequencyMap.keySet().iterator().next();
    }
}