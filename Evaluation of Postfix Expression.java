import java.io.*;
import java.util.*;

public class Solution {
    public static int evaluatePostfix(String expr){
        Stack<Integer> stack=new Stack<>();
        String[] tokens=expr.split(" ");
        
        for(String token:tokens){
            if(Character.isDigit(token.charAt(0))){
                stack.push(Integer.parseInt(token));
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                switch(token){
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(a-b);break;
                    case "*":stack.push(a*b);break;
                    case "/":stack.push(a/b);break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expr=sc.nextLine();
        System.out.println(evaluatePostfix(expr));
    }
}
