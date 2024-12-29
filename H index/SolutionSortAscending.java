import java.util.Arrays;

class SolutionSortAscending {

    public int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[0] > 0 ? 1 : 0;
        }

        Arrays.sort(citations);
        int numberOfPapers = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            numberOfPapers = numberOfPapers + 1;

            if (citations[i] < numberOfPapers) {
                return numberOfPapers - 1;
            }
        }

        return citations.length;
    }
}