class SolutionPrefixesSuffixes {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefixes = new int[nums.length];
        int[] suffixes = new int[nums.length];

        prefixes[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i];
        }

        int lastIndex = nums.length - 1;
        suffixes[lastIndex] = nums[lastIndex];

        for (int i = lastIndex - 1; i >= 0; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i];
        }

        answer[0] = suffixes[1];
        answer[lastIndex] = prefixes[lastIndex - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            answer[i] = prefixes[i - 1] * suffixes[i + 1];
        }

        return answer;
    }
}