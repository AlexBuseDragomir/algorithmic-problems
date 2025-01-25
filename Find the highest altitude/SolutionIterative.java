class SolutionIterative {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = altitude;

        for (int g : gain) {
            altitude = altitude + g;
            max = Math.max(max, altitude);
        }

        return max;
    }
}