import java.util.Scanner;
import apps.a.JavaPerms;
import apps.b.MaxProfit;
import apps.c.WaterContainer;

public class Main {
    public static void main(String[] args) {
        try (Scanner numberScanner = new Scanner(System.in)) {
            System.out.print("Select the program (1, 2, 3) -> ");
            int option = numberScanner.nextInt();

            switch (option) {
                case 1 -> {
                    JavaPerms.main(args);
                    return;
                }
                case 2 -> {
                    MaxProfit.main(args);
                    return;
                }
                case 3 -> {
                    WaterContainer.main(args);
                    return;
                }
            }
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("You have not selected any programs from the list");
        }
    }
}
