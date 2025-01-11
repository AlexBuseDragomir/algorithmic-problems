import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class SolutionDequeHashMap {

    public boolean isValid(String s) {
        Map<Character, Character> matchingParenthesis = new HashMap<>();
        matchingParenthesis.put(')', '(');
        matchingParenthesis.put(']', '[');
        matchingParenthesis.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (matchingParenthesis.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(matchingParenthesis.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}