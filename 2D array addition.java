import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][]a1=new int[r1][c1];
        int[][]a2=new int[r2][c2];
        if(c1==c2&&r1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    a1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    a2[i][j]=sc.nextInt();
                }
            }
            int[][]a3=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    a3[i][j]=a1[i][j]+a2[i][j];
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(a3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Rows and Columns are not Equal");
        }
     }
}
