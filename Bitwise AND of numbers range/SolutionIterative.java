import java.util.LinkedHashMap;
import java.util.Map;

class SolutionIterative {

    private static final Map<Long, Integer> POWERS_OF_TWO = new LinkedHashMap<>();

    static {
        POWERS_OF_TWO.put(1L, 0);
        POWERS_OF_TWO.put(2L, 1);
        POWERS_OF_TWO.put(4L, 2);
        POWERS_OF_TWO.put(8L, 3);
        POWERS_OF_TWO.put(16L, 4);
        POWERS_OF_TWO.put(32L, 5);
        POWERS_OF_TWO.put(64L, 6);
        POWERS_OF_TWO.put(128L, 7);
        POWERS_OF_TWO.put(256L, 8);
        POWERS_OF_TWO.put(512L, 9);
        POWERS_OF_TWO.put(1024L, 10);
        POWERS_OF_TWO.put(2048L, 11);
        POWERS_OF_TWO.put(4096L, 12);
        POWERS_OF_TWO.put(8192L, 13);
        POWERS_OF_TWO.put(16384L, 14);
        POWERS_OF_TWO.put(32768L, 15);
        POWERS_OF_TWO.put(65536L, 16);
        POWERS_OF_TWO.put(131072L, 17);
        POWERS_OF_TWO.put(262144L, 18);
        POWERS_OF_TWO.put(524288L, 19);
        POWERS_OF_TWO.put(1048576L, 20);
        POWERS_OF_TWO.put(2097152L, 21);
        POWERS_OF_TWO.put(4194304L, 22);
        POWERS_OF_TWO.put(8388608L, 23);
        POWERS_OF_TWO.put(16777216L, 24);
        POWERS_OF_TWO.put(33554432L, 25);
        POWERS_OF_TWO.put(67108864L, 26);
        POWERS_OF_TWO.put(134217728L, 27);
        POWERS_OF_TWO.put(268435456L, 28);
        POWERS_OF_TWO.put(536870912L, 29);
        POWERS_OF_TWO.put(1073741824L, 30);
        POWERS_OF_TWO.put(2147483648L, 31);
    }

    public int rangeBitwiseAnd(int left, int right) {
        // If the numbers are equal, the bitwise and is the number.
        if (left == right) {
            return left;
        }

        int exponentLeft = POWERS_OF_TWO.entrySet().stream()
            .filter(entry -> entry.getKey() > left)
            .findFirst()
            .map(Map.Entry::getValue)
            .orElseThrow() - 1;

        int exponentRight = POWERS_OF_TWO.entrySet().stream()
            .filter(entry -> entry.getKey() > right)
            .findFirst()
            .map(Map.Entry::getValue)
            .orElseThrow() - 1;

        // If the exponents are different, the result will be 0.
        if (exponentLeft != exponentRight) {
            return 0;
        }

        // If left is a power of two, and they are under same exponent,
        // the result will be that power of two.
        if (POWERS_OF_TWO.containsKey((long) left)) {
            return left;
        }

        int result = left;

        for (int i = left + 1; i <= right; i++) {
            // overflow
            if (i < 0) {
                return result;
            }

            if (result == 0) {
                return result;
            }

            result &= i;
        }

        return result;
    }
}