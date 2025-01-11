import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class SolutionDequeHelperMethods {

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        char stackCh;

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                stackCh = stack.peek();
                if (isOpen(stackCh) && getReverse(stackCh) == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(char parenthesis) {
        return Arrays.asList('(', '[', '{').contains(parenthesis);
    }

    private char getReverse(char parenthesis) {
        return switch (parenthesis) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> throw new IllegalArgumentException("Invalid parenthesis: " + parenthesis);
        };
    }
}