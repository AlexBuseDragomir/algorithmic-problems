import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionHashSets3 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set12 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
            set12.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set21 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
            set21.add(num);
        }

        set12.removeAll(set2);
        set21.removeAll(set1);

        return Arrays.asList(new ArrayList<>(set12), new ArrayList<>(set21));
    }
}