import java.util.Random;
public class Rand1
{
    public static void main(String[] args) {
        Random rand=new Random();
        int die1=rand.nextInt(6)+1,die2=rand.nextInt(6)+1,sum=die1+die2;
        System.out.println("Die 1:"+die1+"\nDie 2:"+die2+"\nSum:"+sum);
    }
}