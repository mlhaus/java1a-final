import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Helpers {
    public static LocalDate convertStrToDate(String date) {
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate;
        try {
            userDate = LocalDate.parse(date, formatterInput);
        } catch(DateTimeParseException e) {
            userDate = LocalDate.now();
        }
        return userDate;
    }
}
