import java.util.*;
public class StringCharacter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.next();
        int low=0,up=0;
        for(char c:s.toCharArray())
        {
            if(Character.isUpperCase(c)) up++;
            else if(Character.isLowerCase(c)) low++;
        }
        System.out.println("Lower case:"+low+"\nUpper case:"+up);
    }
}