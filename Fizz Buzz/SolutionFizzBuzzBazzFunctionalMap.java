import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class SolutionFizzBuzzBazzFunctionalMap {

    public List<String> fizzBuzzBazz(int n) {
        final Map<Predicate<Integer>, String> rules = new LinkedHashMap<>();
        rules.put(createRulePredicate(3), "Fizz");
        rules.put(createRulePredicate(5), "Buzz");
        rules.put(createRulePredicate(7), "Bazz");

        return IntStream.range(1, n + 1)
            .mapToObj(
                number -> {
                    final StringBuilder builder = new StringBuilder();
                    for (Map.Entry<Predicate<Integer>, String> entry : rules.entrySet()) {
                        if (entry.getKey().test(number)) {
                            builder.append(entry.getValue());
                        }
                    }
                    return builder.isEmpty() ? String.valueOf(number) : builder.toString();
                }
            )
            .toList();
    }

    private static Predicate<Integer> createRulePredicate(Integer divisor) {
        return number -> number % divisor == 0;
    }
}