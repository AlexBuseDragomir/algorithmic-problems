import java.util.HashSet;
import java.util.Set;

class SolutionSlidingWindow {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> kElementsSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                kElementsSet.remove(nums[i - k - 1]);
            }
            if (kElementsSet.contains(nums[i])) {
                return true;
            }

            kElementsSet.add(nums[i]);
        }

        return false;
    }
}