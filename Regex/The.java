import java.util.*;
import java.util.regex.*;
public class The
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        System.out.println(s);
        String regex="\\b"+Pattern.quote("the")+"\\b";
        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(s);
        if(matcher.find())
        {
            System.out.println("Given string contains the word 'the'");
        }
        else
        {
            System.out.println("Given string does not contain the word 'the'");
        }
    }
}