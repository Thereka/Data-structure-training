import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char ch1[] = s1.toCharArray();
        int l1 = s1.length();

        String s2 = sc.nextLine();
        char ch2[] = s2.toCharArray();
        int l2 = s2.length();
        int f = 0; 
        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                if (ch1[i] != ch2[i]) {
                    f = 1;
                    break; 
                }
            }
        } 
        else {
            f = 1; 
        }
        if (f == 0) {
            System.out.println("Equal String");
        } else {
            System.out.println("Not Equal String");
        }
    }
}
