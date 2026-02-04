import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\n==== MAIN MENU ====");
            System.out.println("1. Say Hello");
            System.out.println("2. Do Something");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            // Handle invalid input safely
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("👋 Hello, User!");
                    break;

                case 2:
                    System.out.println("⚙️ Doing some action...");
                    break;

                case 3:
                    System.out.println("👋 Exiting program... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

