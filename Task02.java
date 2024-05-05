import java.util.Scanner;

public class SimpleBankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited Rs.%.2f. New balance is Rs.%.2f.%n", depositAmount, balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.printf("Successfully withdrew Rs.%.2f. Remaining balance is Rs.%.2f.%n", withdrawalAmount, balance);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.printf("Your current balance is Rs.%.2f.%n", balance);
                    break;
            }
        }

        System.out.println("Thank you for using our banking application!");
        scanner.close();
    }
}