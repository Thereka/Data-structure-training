import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); 
        String str2 = sc.next(); 
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        int[] a1 = new int[256]; 
        int[] a2 = new int[256];
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                int asci;
                asci=(int)ch1[i];
                a1[asci]++;
                asci=(int)ch2[i];
                a2[asci]++;
            }
        }
        
        for (int i = 0; i < 256; i++) {
                if (a1[i] > 0) {
                    System.out.println((char)i + "  " + a1[i]);
                }
            }

            System.out.println("Frequency in str2:");
            for (int i = 0; i < 256; i++) {
                if (a2[i] > 0) {
                    System.out.println((char)i + "  " + a2[i]);
                }
            }
    } 
}     

