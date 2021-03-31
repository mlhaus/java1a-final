import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String menuTitle = "Main Menu";
        String prompt = "Select an option:";
        String[] menuOptions = {
            "Option 1",
            "Option 2",
            "Option 3"
        };
        int choice = 0;
        while (true) {
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            UIUtility.showSectionTitle(menuOptions[Integer.valueOf(choice) - 1]);
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}