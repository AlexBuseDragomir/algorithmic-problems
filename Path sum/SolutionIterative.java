import java.util.ArrayDeque;
import java.util.Deque;

class SolutionIterative {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Deque<NodeSum> stack = new ArrayDeque<>();
        stack.add(new NodeSum(root, root.val));

        NodeSum currentNode;
        int currentNodeSum;

        while (! stack.isEmpty()) {
            currentNode = stack.pop();
            currentNodeSum = currentNode.pathSum;

            if (currentNode.node.left == null
                    && currentNode.node.right == null
                    && currentNodeSum == targetSum) {
                return true;
            }

            if (currentNode.node.right != null) {
                stack.add(new NodeSum(currentNode.node.right,
                    currentNodeSum + currentNode.node.right.val));
            }
            if (currentNode.node.left != null) {
                stack.add(new NodeSum(currentNode.node.left,
                    currentNodeSum + currentNode.node.left.val));
            }
        }

        return false;
    }

    private record NodeSum(TreeNode node, int pathSum) {}
}