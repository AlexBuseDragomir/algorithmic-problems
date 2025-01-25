import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

class SolutionHashSets2 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(toSet());

        return Arrays.asList(
            Arrays.stream(nums1).boxed().filter(num -> !set2.contains(num)).distinct().toList(),
            Arrays.stream(nums2).boxed().filter(num -> !set1.contains(num)).distinct().toList()
        );
    }
}