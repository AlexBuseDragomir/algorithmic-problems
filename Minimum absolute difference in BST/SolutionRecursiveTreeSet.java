import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SolutionRecursiveTreeSet {

    public int getMinimumDifference(TreeNode root) {
        Set<Integer> values = new TreeSet<>();
        dfsRecursive(root, values);

        Iterator<Integer> iterator = values.iterator();
        Integer firstValue = iterator.next();
        Integer secondValue = iterator.next();

        int diff = Math.abs(secondValue - firstValue);
        int minDiff = diff;

        while (iterator.hasNext()) {
            firstValue = secondValue;
            secondValue = iterator.next();
            diff = Math.abs(secondValue - firstValue);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private void dfsRecursive(TreeNode root, Set<Integer> values) {
        if (root == null) {
            return;
        }

        values.add(root.val);

        dfsRecursive(root.left, values);
        dfsRecursive(root.right, values);
    }
}