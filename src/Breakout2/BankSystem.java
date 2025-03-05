package Breakout2;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Abstract Class
abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance);
    }
}

// Interface
interface InterestCalculator {
    double calculateInterest();
}

// SavingsAccount
class SavingsAccount extends BankAccount implements InterestCalculator {
    private static final double INTEREST_RATE = 0.08;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

// CurrentAccount
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 25000;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance + OVERDRAFT_LIMIT) {
            throw new InsufficientFundsException("Exceeds overdraft limit!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

// BankingSystem Class
public class BankSystem {
    public static void main(String[] args) {
        try {
            // Create SavingsAccount and CurrentAccount instances
            SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 10000);
            CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 5000);

            // Demonstrate deposit
            savingsAccount.deposit(2000);
            savingsAccount.displayBalance();

            // Demonstrate successful withdrawal
            savingsAccount.withdraw(5000);
            savingsAccount.displayBalance();

            // Demonstrate insufficient funds exception
            try {
                savingsAccount.withdraw(15000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }

            // Demonstrate overdraft in CurrentAccount
            currentAccount.withdraw(20000);
            currentAccount.displayBalance();

            // Demonstrate exceeding overdraft limit
            try {
                currentAccount.withdraw(30000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
