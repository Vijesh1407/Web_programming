import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class DT2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year 1:");
        int y1=sc.nextInt();
        System.out.print("Enter year 2:");
        int y2=sc.nextInt();
        LocalDate sd=LocalDate.of(y1,1,1);
        LocalDate ed=LocalDate.of(y2,1,1);
        long ans=ChronoUnit.DAYS.between(sd, ed);
        System.out.print("Number of days between "+y1+" and "+y2+": "+Math.abs(ans));
    }
}