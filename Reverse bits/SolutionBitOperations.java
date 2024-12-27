public class SolutionBitOperations {

    public int reverseBits(int n) {
        int[] reversedBitArray = new int[32];

        for (int i = 0; i < 32; i++) {
            reversedBitArray[i] = (n >> i) & 1;
        }

        int reversed = 0;

        for (int bit : reversedBitArray) {
            reversed = (reversed << 1) | bit;
        }

        return reversed;
    }
}