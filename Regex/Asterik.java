import java.util.*;
public class Asterik
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        String ans=s.replaceAll("\\d","*");
        System.out.println("Result:"+ans);
    }
}