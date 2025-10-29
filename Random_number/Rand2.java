import java.util.Random;
import java.util.Scanner;
public class Rand2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int low=1,high=100,ans=rand.nextInt(high-low+1)+low,guess=0,count=0;
        System.out.println("Guess number (1 to 100):");
        while(guess!=ans)
        {
            System.out.print("Enter your guess:");
            guess=sc.nextInt();
            count++;
            if(guess<ans)
            {
                System.out.println("Enter bigger number");
            }
            else if(guess>ans)
            {
                System.out.println("Enter smaller number");
            }
            else
            {
                System.out.println("Guess is correct.\nTotal attempts:"+count);
            }
        }
    }
}