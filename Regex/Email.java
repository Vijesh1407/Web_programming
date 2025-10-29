import java.util.*;
import java.util.regex.*;
public class Email
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email:");
        String s=sc.nextLine();
        String regex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        if(matcher.matches())
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }
}