import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(arr[i][j]!=0){
                    f=1;
                }
            }
            if(f==1){
               break; 
            }
            
        }

        if (f==0) {
            System.out.println("lower triangular matrix");
        } else {
            System.out.println("Not an lower triangular matrix");
        }
    }
}
