import java.time.LocalDate;
public class Main {
    public static void main(String[] args){
        LocalDate today= LocalDate.now();
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        LocalDate endOfYear=today.withDayOfYear(today.lengthOfYear());
        int daysLefEndOfMonth = endOfMonth.lengthOfMonth()-today.getDayOfMonth();
        int dayLeftEndOfYear = (endOfYear.lengthOfYear()-today.getDayOfYear());
        System.out.println("Days left till the end of the month= "+daysLefEndOfMonth);
        System.out.println("Days left till the end of the year= "+dayLeftEndOfYear);
    }
}