package depositandwithdrawalfiles;

public class SavingsAccount {
    private double accountBalance;
    private double annualInterestRate;
    private double lastAmountOfInterestEarned;

    public SavingsAccount(double balance, double interestRate) {

        accountBalance = balance;
        annualInterestRate = interestRate;
        lastAmountOfInterestEarned = 0.0;
    }

    public void withdraw(double withdrawAmount) {
        accountBalance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public void addInterest() {

        // Get the monthly interest rate.
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate the last amount of interest earned.
        lastAmountOfInterestEarned = monthlyInterestRate * accountBalance;

        // Add the interest to the balance.
        accountBalance += lastAmountOfInterestEarned;
    }
}
