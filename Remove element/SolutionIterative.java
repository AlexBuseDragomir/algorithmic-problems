class SolutionIterative {

    public int removeElement(int[] nums, int val) {
        int numberOfEncounters = 0;
        int indexToInsert = 0;
        int[] copy = returnCopyOfArray(nums);


        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == val) {
                numberOfEncounters++;
            } else {
                nums[indexToInsert++] = copy[i];
            }
        }

        return nums.length - numberOfEncounters;
    }

    public int[] returnCopyOfArray(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < destination.length; i ++) {
            destination[i] = source[i];
        }
        return destination;
    }
}