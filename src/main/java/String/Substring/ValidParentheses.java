package String.Substring;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // If opening bracket then push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // if closing bracket then pop
            else {
                if (stack.isEmpty()) return false;

                if (
                        (ch == ')' && stack.pop() != '(')
                        || (ch == '}' && stack.pop() != '{')
                        || (ch == ']' && stack.pop() != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void main(String[] args) {
        String str = "()[]{}";
//        "()"        → true
//        "()[]{}"    → true
//        "(]"        → false
//        "([)]"      → false
//        "{[]}"      → true
        System.out.println(isValid(str));
    }
}
