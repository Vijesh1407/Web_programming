import java.util.*;
public class Rand4
{
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        while(count<n)
        {
            int a=rand.nextInt(10)+1;
            if(a%2==0)
            {
                arr[count]=a;
                count++;
            }
        }
        System.out.print("Random array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}