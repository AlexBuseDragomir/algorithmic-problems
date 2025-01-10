import java.util.Arrays;
import java.util.stream.Collectors;

class SolutionFunctionalStyle {

    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() != nums.length;
    }
}