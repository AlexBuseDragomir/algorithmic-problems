import java.util.Arrays;

class SolutionIterative {

    public int hIndex(int[] citations) {

        for (int i = citations.length; i >= 0; i--) {
            final int tentativeHIndex = i;
            boolean isValid = Arrays.stream(citations)
                .filter(citation -> citation >= tentativeHIndex)
                .count() >= tentativeHIndex;

            if (isValid) {
                return tentativeHIndex;
            }
        }

        return 0;
    }
}