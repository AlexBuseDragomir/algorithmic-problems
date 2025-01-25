import java.util.ArrayList;
import java.util.List;

class SolutionIterative {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}