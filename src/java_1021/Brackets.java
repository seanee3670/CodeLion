import java.util.Stack;

public class Brackets {
    public boolean Solution(String s) {
        Stack<Character> stack = new Stack<Character>();

        if (s.charAt(0) == ')') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                stack.pop();
            }

        }

        return !stack.isEmpty();

    }
}
