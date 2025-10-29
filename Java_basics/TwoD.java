import java.util.Scanner;
public class TwoD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of ros:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}