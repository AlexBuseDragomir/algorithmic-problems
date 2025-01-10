import java.util.HashSet;
import java.util.Set;

class SolutionHashSet {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : nums) {
            if (uniqueElements.contains(num)) {
                return true;
            }
            uniqueElements.add(num);
        }

        return false;
    }
}