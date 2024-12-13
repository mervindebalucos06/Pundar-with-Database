import java.util.Scanner;

import src.service.UserService; // Update the package name to the correct one

public class Main {
  public static void main(String[] args) {
    UserService userService = new UserService();
    boolean exit = false;

    try (Scanner input = new Scanner(System.in)) { // Use try-with-resources for Scanner
      while (!exit) {
      
        System.out.println();
        System.out.println("===============================================");
        System.out.println("        P---  U---  N---  D---  A---  R---    ");
        System.out.println("===============================================");
        System.out.println(" *** Retirement Investment Planning System ***");
        System.out.println("===============================================");
        System.out.println("        Plan today for a secure tomorrow!      ");
        System.out.println("===============================================");
        System.out.println();
        System.out.println("\t\t1. Sign Up");
        System.out.println("\t\t2. Login");
        System.out.println("\t\t3. About Us");
        System.out.println("\t\t4. Exit");
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
    }
    // Scanner is automatically closed here
    }
  }