import java.util.HashMap;
import java.util.Map;

class SolutionHashMap {

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (target % 2 == 0 && nums[i] == target / 2) {
                result[index++] = i;
            }

            if (index == 2) {
                return result;
            }

            map.put(nums[i], i);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.containsKey(target - entry.getKey())) {
                return new int[]{entry.getValue(), map.get(target - entry.getKey())};
            }
        }

        return result;
    }
}