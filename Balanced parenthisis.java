import java.io.*;
import java.util.*;

public class Solution {
    static boolean isBalanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.empty())
                    return false;
                char top=st.pop();
                if(ch==')'&& top!='(')
                    return false;
                if(ch==']' && top!='[')
                    return false;
                if(ch=='}' && top!='{')
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(isBalanced(s));
    }
}
