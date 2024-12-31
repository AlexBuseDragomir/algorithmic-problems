class SolutionHybridApproach {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        boolean containsZero = false;

        for (int num : nums) {
            if (num == 0) {
                containsZero = true;
                break;
            }
        }

        if (!containsZero) {
            int product = 1;

            for (int num : nums) {
                product *= num;
            }

            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                int product = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    product *= nums[j];
                }
                answer[i] = product;
            }
        }

        return answer;
    }
}