import java.util.List;
import java.util.stream.IntStream;

class SolutionFunctional {

    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1)
            .mapToObj(number -> {
                    if (number % 15 == 0) {
                        return "FizzBuzz";
                    } else if (number % 3 == 0) {
                        return "Fizz";
                    } else if (number % 5 == 0) {
                        return "Buzz";
                    } else {
                        return String.valueOf(number);
                    }
                }
            ).toList();
    }
}