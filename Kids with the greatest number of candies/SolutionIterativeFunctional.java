import java.util.Arrays;
import java.util.List;

class SolutionIterativeFunctional {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        final int maximum = max;

        return Arrays.stream(candies)
            .mapToObj(candy -> candy + extraCandies >= maximum)
            .toList();
    }
}