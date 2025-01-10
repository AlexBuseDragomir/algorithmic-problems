import java.util.HashSet;
import java.util.Set;

class SolutionHashSet {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int longestSequence = 1;
        int currentNum;
        int currentSequence;

        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                currentNum = num;
                currentSequence = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }
}