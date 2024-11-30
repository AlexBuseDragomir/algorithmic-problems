package main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzMain {

    private static final Map<Predicate<Integer>, String> RULES;

    static {
        RULES = new LinkedHashMap<>();

        RULES.put(createRulePredicate(3), "FIZZ");
        RULES.put(createRulePredicate(5), "BUZZ");
        RULES.put(createRulePredicate(7), "BAZZ");
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzBazzSolver(105));
    }

    private static String fizzBuzzBazzSolver(int limit) {
        return IntStream.range(1, limit + 1)
            .mapToObj(
                number -> {
                    StringBuilder stringBuilder = new StringBuilder(number + " ");

                    RULES.keySet().forEach(
                        ruleKey -> {
                            if (ruleKey.test(number)) {
                                stringBuilder.append(RULES.get(ruleKey));
                            }
                        }
                    );

                    return stringBuilder.toString();
                }
            )
            .collect(Collectors.joining("\n"));
    }

    private static Predicate<Integer> createRulePredicate(Integer divisor) {
        return number -> number % divisor == 0;
    }
}
