import java.util.stream.IntStream;

class SolutionToBinaryString {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countBitsForNumber(i);
        }
        return result;
    }

    public int countBitsForNumber(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();

        return (int) IntStream.range(0, chars.length)
            .mapToObj(i -> chars[i]).filter(ch -> ch == '1').count();
    }
}