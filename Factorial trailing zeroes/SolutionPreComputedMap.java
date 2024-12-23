import java.util.LinkedHashMap;
import java.util.Map;

class SolutionPreComputedMap {

    private static final Map<Integer, Integer> PRE_COMPUTED_MAP = new LinkedHashMap<>();
    static {
        PRE_COMPUTED_MAP.put(3125, 781);
        PRE_COMPUTED_MAP.put(625, 156);
        PRE_COMPUTED_MAP.put(125, 31);
        PRE_COMPUTED_MAP.put(25, 6);
        PRE_COMPUTED_MAP.put(5, 1);
    }

    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            Map.Entry<Integer, Integer> entry = getExponentSumUpToN(n);
            count += entry.getValue();
            n = n - entry.getKey();
        }
        return count;
    }

    private Map.Entry<Integer, Integer> getExponentSumUpToN(int n) {
        if (n < 5) {
            return Map.entry(n, 0);
        }

        for (Map.Entry<Integer, Integer> entry : PRE_COMPUTED_MAP.entrySet()) {
            if (entry.getKey() <= n) {
                return entry;
            }
        }

        return Map.entry(n, 0);
    }
}
