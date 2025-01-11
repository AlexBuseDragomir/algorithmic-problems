class SolutionArrayEfficient {

    public boolean isValid(String s) {
        char[] stack = new char[10000];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (top == -1) {
                top++;
                stack[top] = ch;
            } else {
                if (shouldPop(stack[top], ch)) {
                    top--;
                } else {
                    top++;
                    stack[top] = ch;
                }
            }
        }
        return top == -1;
    }

    private boolean shouldPop(char stackCh, char ch) {
        return stackCh == '(' && ch == ')'
            || stackCh == '[' && ch == ']'
            || stackCh == '{' && ch == '}';
    }
}