import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DT6
{
    public static void main(String[] args)
    {
        LocalDateTime now=LocalDateTime.now();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hours to subtract:");
        long h=sc.nextLong();
        System.out.print("Enter minutes to subtract:");
        long m=sc.nextLong();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current date and time:"+now.format(formatter));
        LocalDateTime ans=now.minusHours(h).minusMinutes(m);
        System.out.println("Date and time before "+h+" hours and "+m+" minutes: "+ans.format(formatter));
    }
}