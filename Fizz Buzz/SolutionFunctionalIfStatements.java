import java.util.List;
import java.util.stream.IntStream;

class SolutionFunctionalIfStatements {

    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1)
            .mapToObj(number -> {
                    String result = "";
                    if (number % 3 == 0) {
                        result = result + "Fizz";
                    }
                    if (number % 5 == 0) {
                        result = result + "Buzz";
                    }
                    return result.isEmpty() ? String.valueOf(number) : result;
                }
            ).toList();
    }
}