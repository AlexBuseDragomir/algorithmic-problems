import java.util.ArrayList;
import java.util.List;

class SolutionArrayList {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        dfsRecursive(root, values);

        Integer firstValue = values.get(0);
        Integer secondValue = values.get(1);

        int diff = Math.abs(secondValue - firstValue);
        int minDiff = diff;

        for (int i = 2; i < values.size(); i ++) {
            firstValue = secondValue;
            secondValue = values.get(i);
            diff = Math.abs(secondValue - firstValue);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private void dfsRecursive(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        dfsRecursive(root.left, values);
        values.add(root.val);
        dfsRecursive(root.right, values);
    }
}
