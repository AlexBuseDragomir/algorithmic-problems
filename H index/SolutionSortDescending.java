import java.util.Arrays;
import java.util.Comparator;

class SolutionSortDescending {

    public int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[0] > 0 ? 1 : 0;
        }

        Integer[] citationArray = Arrays.stream(citations)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .toArray(Integer[]::new);

        for (int i = 0; i < citationArray.length; i++) {
            int numberOfPapers = i + 1;
            if (citationArray[i] < numberOfPapers) {
                return i;
            }
        }

        return citations.length;
    }
}