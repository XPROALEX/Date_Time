import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int daysInCurrentMonth = today.lengthOfMonth();
        int daysLefEndOfMonth = daysInCurrentMonth - today.getDayOfMonth();
        System.out.println("Days left till the end of the month= " + daysLefEndOfMonth);

        Year currentYear = Year.now();
        int daysInCurrentYear = currentYear.length();
        int dayLeftEndOfYear = daysInCurrentYear - today.getDayOfYear();
        System.out.println("Days left till the end of the year= " + dayLeftEndOfYear);
    }
}