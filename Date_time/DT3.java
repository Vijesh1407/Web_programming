import java.time.LocalDate;
import java.time.temporal.*;
import java.util.*;
public class DT3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date 1 (yyyy-mm-dd):");
        String s1=sc.next();
        LocalDate d1=LocalDate.parse(s1);
        System.out.print("Enter date 2 (yyyy-mm-dd):");
        String s2=sc.next();
        LocalDate d2=LocalDate.parse(s2);
        long ans=ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Number of days between the dates:"+ans);
    }
}