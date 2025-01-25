import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

class SolutionHashSets1 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(toSet());

        Set<Integer> difference12 = new HashSet<>(set1);
        Set<Integer> difference21 = new HashSet<>(set2);

        difference12.removeAll(set2);
        difference21.removeAll(set1);

        return Arrays.asList(new ArrayList<>(difference12), new ArrayList<>(difference21));
    }
}