import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int len=str.length();
        int sum=0;
        for(int i=0;i<len;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                
                sum=sum+((int)ch[i]-48);
            }
        }
        System.out.print(sum);
    }
}
