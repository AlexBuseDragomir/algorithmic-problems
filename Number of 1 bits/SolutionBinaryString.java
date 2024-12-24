class SolutionBinaryString {

    public int hammingWeight(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        String binaryString = Integer.toBinaryString(n);

        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}