import java.io.*;
import java.util.*;

public class Solution {
    public static int[] dailyTemperature(int[] temperature){
        int n=temperature.length;
        int[] result=new int[n];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperature[i]>temperature[stack.peek()]){
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] temperature=new int[n];
        for(int i=0;i<n;i++){
            temperature[i]=sc.nextInt();
        }
        int[] ans = dailyTemperature(temperature);
                for (int a : ans) {
            System.out.print(a + " ");
        }
        
    }
}
