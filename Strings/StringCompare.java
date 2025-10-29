import java.util.*;
public class StringCompare
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1:");
        String s1=sc.next();
        System.out.print("Enter string 2:");
        String s2=sc.next();
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
    }
}