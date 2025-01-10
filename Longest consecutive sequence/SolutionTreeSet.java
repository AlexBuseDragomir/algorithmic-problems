import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SolutionTreeSet {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        Set<Integer> sortedSet = new TreeSet<>();

        for (int num : nums) {
            sortedSet.add(num);
        }

        Iterator<Integer> iterator = sortedSet.iterator();
        int previousElement = iterator.next();
        int currentElement;

        int longestSequence = 1;
        int currentSequence = 1;

        while (iterator.hasNext()) {
            currentElement = iterator.next();

            if (currentElement == previousElement + 1) {
                currentSequence++;
            } else {
                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                }
                currentSequence = 1;
            }

            previousElement = currentElement;
        }

        if (currentSequence > longestSequence) {
            longestSequence = currentSequence;
        }

        return longestSequence;
    }
}