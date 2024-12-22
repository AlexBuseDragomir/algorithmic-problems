import java.util.ArrayList;
import java.util.List;

class SolutionIterativeV1 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            StringBuilder value = new StringBuilder();
            if (i % 3 == 0) {
                value.append("Fizz");
            }
            if (i % 5 == 0) {
                value.append("Buzz");
            }
            if (value.isEmpty()) {
                value.append(i);
            }
            result.add(value.toString());
        }
        return result;
    }
}