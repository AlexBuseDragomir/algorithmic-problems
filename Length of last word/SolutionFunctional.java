import java.util.Arrays;
import java.util.List;

class SolutionFunctional {

    public int lengthOfLastWord(String s) {
        List<String> words = Arrays.stream(s.trim().split("\\s+")).toList();
        return words.getLast().length();
    }
}