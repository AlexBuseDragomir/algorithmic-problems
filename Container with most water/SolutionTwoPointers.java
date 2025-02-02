class SolutionTwoPointers {

    public int maxArea(int[] height) {
        int maxVolume = 0;
        int volume;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            volume = (right - left) * Math.min(height[left], height[right]);
            maxVolume = Math.max(volume, maxVolume);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxVolume;
    }
}