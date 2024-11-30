import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

class SolutionTreeMap {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer, Integer> treeMap = new TreeMap<>();

        BinaryOperator<Integer> remappingFunction =
            (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            };

        for (int i = 0; i < m; i ++) {
            treeMap.compute(nums1[i], remappingFunction);
        }

        for (int i = 0; i < n; i ++) {
            treeMap.compute(nums2[i], remappingFunction);
        }

        copyOrderedMapToArray(treeMap, nums1);
    }

    public void copyOrderedMapToArray(Map<Integer, Integer> map, int[] array) {
        int index = 0;
        for (Integer key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                array[index++] = key;
            }
        }
    }
}