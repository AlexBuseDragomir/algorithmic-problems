import java.util.ArrayDeque;
import java.util.Deque;

class SolutionDequeSimple {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (shouldPop(stack.peek(), ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean shouldPop(char stackCh, char ch) {
        return stackCh == '(' && ch == ')'
            || stackCh == '[' && ch == ']'
            || stackCh == '{' && ch == '}';
    }
}