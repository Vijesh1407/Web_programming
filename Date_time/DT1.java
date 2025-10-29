import java.time.*;
import java.time.format.*;
public class DT1
{
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String ans=now.format(formatter);
        System.out.println("Current Date and Time:"+ans);
    }
}