import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DT7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your birth year:");
        int y=sc.nextInt();
        System.out.print("Enter your birth month:");
        int m=sc.nextInt();
        System.out.print("Enter your birth day:");
        int d=sc.nextInt();
        LocalDate bday=LocalDate.of(y,m,d);
        LocalDate today=LocalDate.now();
        Period age=Period.between(bday,today);
        System.out.println("Your age: "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days.");
    }
}