import java.util.*;
import java.util.regex.*;
public class Digit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        String regex="\\d";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        if(matcher.find())
        {
            System.out.println("Contains digit");
        }
        else
        {
            System.out.println("Does not contain digit");
        }
    }
}