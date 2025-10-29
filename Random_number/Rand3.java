import java.util.*;
public class Rand3
{
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of flips:");
        int n=sc.nextInt();
        int h=0,t=0;
        for(int i=0;i<n;i++)
        {
            int ans=rand.nextInt(2);
            if(ans==1)
            {
                h++;
            }
            else
            {
                t++;
            }
        }
        System.out.println("Heads: "+h+"\nTails: "+t);
    }
}