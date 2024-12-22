import java.util.ArrayList;
import java.util.List;

class SolutionNoModulus {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        int fizz = 3;
        int buzz = 5;

        for (int i = 1; i <= n; i++) {
            String output = "";

            if (i == fizz) {
                output += "Fizz";
                fizz += 3;
            }
            if (i == buzz) {
                output += "Buzz";
                buzz += 5;
            }

            result.add(output.isEmpty() ? Integer.toString(i) : output);
        }

        return result;
    }
}