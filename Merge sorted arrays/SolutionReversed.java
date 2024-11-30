class SolutionReversed {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        if (m == 0) {
            for (int i = 0; i < n; i ++) {
                nums1[i] = nums2[i];
            }
        }

        int indexNums1 = m - 1;
        int indexNums2 = n - 1;

        int indexInsert = m + n - 1;

        while (indexInsert >= 0) {
            if (indexNums1 == -1) {
                nums1[indexInsert] = nums2[indexNums2];
                indexNums2--;
                indexInsert--;
                continue;
            }

            if (indexNums2 == -1) {
                nums1[indexInsert] = nums1[indexNums1];
                indexNums1--;
                indexInsert--;
                continue;
            }

            if (nums1[indexNums1] >= nums2[indexNums2]) {
                nums1[indexInsert] = nums1[indexNums1];
                indexNums1--;
            } else {
                nums1[indexInsert] = nums2[indexNums2];
                indexNums2--;
            }

            indexInsert--;
        }
    }
}