
import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    private int nextAccountNo = 1001;

    public void createAccount(String name, double initialDeposit) {
        Account acc = new Account(nextAccountNo, name, initialDeposit);
        accounts.add(acc);
        System.out.println(" Account Created! Your Account No is: " + nextAccountNo);
        nextAccountNo++;
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNo() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts yet!");
            return;
        }
        System.out.println("\n--- All Accounts ---");
        for (Account acc : accounts) {
            acc.display();
        }
    }
}
