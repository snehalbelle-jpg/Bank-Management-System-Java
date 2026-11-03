
public class Account {

    private int accountNo;
    private String name;
    private double balance;

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" ₹" + amount + " Deposited. New Balance: ₹" + balance);
        } else {
            System.out.println(" Invalid Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" ₹" + amount + " Withdrawn. New Balance: ₹" + balance);
        } else {
            System.out.println(" Insufficient Balance or Invalid Amount!");
        }
    }

    public void display() {
        System.out.println(accountNo + " | " + name + " | Balance: ₹" + balance);
    }
}
