
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Snehal's Bank - Solapur");

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Your Name: ");
                String name = sc.nextLine();
                System.out.print("Initial Deposit (₹): ");
                double bal = sc.nextDouble();
                bank.createAccount(name, bal);
            } else if (choice == 2) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                Account acc = bank.findAccount(accNo);
                if (acc != null) {
                    System.out.print("Deposit Amount: ₹");
                    double amt = sc.nextDouble();
                    acc.deposit(amt);
                } else {
                    System.out.println(" Account Not Found!");
                }
            } else if (choice == 3) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                Account acc = bank.findAccount(accNo);
                if (acc != null) {
                    System.out.print("Withdraw Amount: ₹");
                    double amt = sc.nextDouble();
                    acc.withdraw(amt);
                } else {
                    System.out.println(" Account Not Found!");
                }
            } else if (choice == 4) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                Account acc = bank.findAccount(accNo);
                if (acc != null) {
                    System.out.println("--- Account Details ---");
                    acc.display();
                } else {
                    System.out.println(" Account Not Found!");
                }
            } else if (choice == 5) {
                bank.showAllAccounts();
            } else if (choice == 6) {
                System.out.println("Thank You! Visit Again ");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
