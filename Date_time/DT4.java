import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class DT4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year:");
        int y=sc.nextInt();
        LocalDateTime start=LocalDateTime.of(y,1,1,0,0,0);
        LocalDateTime end=LocalDateTime.now();
        long s=ChronoUnit.SECONDS.between(start,end);
        System.out.println("Seconds since "+y+" : "+s);
    }
}