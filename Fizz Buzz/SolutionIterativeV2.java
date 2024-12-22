import java.util.ArrayList;
import java.util.List;

class SolutionIterativeV2 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            builder.setLength(0);
            if (i % 15 == 0) {
                builder.append("FizzBuzz");
            } else if (i % 3 == 0) {
                builder.append("Fizz");
            } else if (i % 5 == 0) {
                builder.append("Buzz");
            } else {
                builder.append(i);
            }
            result.add(builder.toString());
        }
        return result;
    }
}