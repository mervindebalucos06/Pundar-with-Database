import java.util.Scanner;
import src.service.UserService;

public class Main {
  public static void main(String[] args) {
    UserService userService = new UserService();
    boolean exit = false;

    try (Scanner input = new Scanner(System.in)) { // Use try-with-resources for Scanner
      while (!exit) {
        System.out.println("\n=== Pundar: Retirement Investment Planning System ===");
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. About Us");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();

        switch (choice) {
          case 1 -> userService.signUp();
          case 2 -> userService.login();
          case 3 -> userService.aboutUs();
          case 4 -> {
            System.out.println("Exiting... Thank you for using Pundar!");
            exit = true;
          }
          default -> System.out.println("Invalid choice. Please try again.");
        }
      }
    } // Scanner is automatically closed here
  }
}