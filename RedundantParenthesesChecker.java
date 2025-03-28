import java.util.Stack;

public class RedundantParenthesesChecker {
    public static boolean hasRedundantParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == ')') {
                char top = stack.pop();
                boolean hasOperator = false;

                while (top != '(') {
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                    top = stack.pop();
                }

                if (!hasOperator) {
                    return true; 
                }
            } else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] expressions = {"((a+b))", "(a + (b))", "((a))", "(a + b * c)", "(a / (b + c))"};

        for (String expr : expressions) {
            if (hasRedundantParentheses(expr)) {
                System.out.println("Redundant: " + expr);
            } else {
                System.out.println("Not Redundant: " + expr);
            }
        }
    }
}
