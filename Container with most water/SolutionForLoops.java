class SolutionForLoops {

    public int maxArea(int[] height) {
        int volume;
        int maxVolume = -1;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j ++) {
                volume = Math.min(height[i], height[j]) * (j - i);
                maxVolume = Math.max(volume, maxVolume);
            }
        }

        return maxVolume;
    }
}