class SolutionSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        sort(nums1);
    }

    void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}