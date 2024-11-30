class SolutionIterative {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            copyArray(nums2, nums1);
        }

        if (n == 0) {
            return;
        }

        int[] merged = new int[m + n];

        int indexNums1 = 0;
        int indexNums2 = 0;

        int indexMerged = 0;

        while (indexNums1 < m || indexNums2 < n) {
            if (indexNums1 == m) {
                merged[indexMerged++] = nums2[indexNums2];
                indexNums2++;
                continue;
            }

            if (indexNums2 == n) {
                merged[indexMerged++] = nums1[indexNums1];
                indexNums1++;
                continue;
            }

            if (nums1[indexNums1] <= nums2[indexNums2]) {
                merged[indexMerged++] = nums1[indexNums1];
                indexNums1++;
            } else {
                merged[indexMerged++] = nums2[indexNums2];
                indexNums2++;
            }
        }

        copyArray(merged, nums1);
    }

    public int[] copyArray(int[] source, int[] destination) {
        for (int i = 0; i < destination.length; i ++) {
            destination[i] = source[i];
        }
        return destination;
    }
}