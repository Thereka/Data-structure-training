import java.util.*;

public class Solution {
    public static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '/':case '*': return 2;
            case '-':case '+': return 1;  
            default: return -1;
        }
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
           
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
           
            else if (ch == '(') {
                stack.push(ch);
            }
           
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
           
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

       
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infixExpression = sc.nextLine();
        System.out.println(infixToPostfix(infixExpression));
       
    }
}
