public class SolutionIterative {

    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        int numberOfEncounters = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] != nums[i]) {
                numberOfEncounters = 1;
                nums[insertIndex] = nums[i+1];
                insertIndex++;
            } else if (nums[i+1] == nums[i]) {
                numberOfEncounters ++;
                if (numberOfEncounters == 2) {
                    nums[insertIndex] = nums[i+1];
                    insertIndex++;
                }
            }
        }

        return insertIndex;
    }
}
