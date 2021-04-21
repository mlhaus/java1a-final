import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Helpers {
    public static void testData(Scanner scanner) {
        Book b1 = new Book();
        Book b2 = new Book("Java 1", "Marc Hauschildt", "2021-02-06", 300, true);
        System.out.println(b1);
        System.out.println(b2);
        UIUtility.pressEnterToContinue(scanner);
    }


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
