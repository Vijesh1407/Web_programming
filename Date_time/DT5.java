import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class DT5
{
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalDate prev=now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        LocalDate next=now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Previous Thursday:"+prev);
        System.out.println("Next Thursday:"+next);
    }
}