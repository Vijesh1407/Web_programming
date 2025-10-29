import java.util.Scanner;
public class OneD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Entered array:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}