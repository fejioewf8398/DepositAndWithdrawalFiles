package depositandwithdrawalfiles;


import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DepositAndWithdrawalFiles {


    public static void main(String[] args) {
    // Create a Scanner to read scanner input.
    Scanner scanner = new Scanner(System.in);

    // Ask user to enter annual interest rate
    System.out.print("Enter the savings account's "
            + "annual interest rate: ");
    double interestRate = scanner.nextDouble();

    DepositAndWithdrawalFiles depositAndWithdrawalFiles = new DepositAndWithdrawalFiles();
    SavingsAccount savingsAccount = depositAndWithdrawalFiles.new SavingsAccount(500, interestRate);

    // create a path to the deposit file
    File deposits = new File(
            "deposits.txt"
    );
    
    Scanner inputFileDeposits = new Scanner("deposits.txt");

    // sum all lines in file and setting value in saving account
    //double totalDeposits = deposits.lines(depositPath).mapToDouble(Double::valueOf).sum();

    savingsAccount.deposit(depositAmount);

    // create a path to the withdrawls file
    File withdrawals = new File(
            "withdrawals.txt"
    );
    
    Scanner inputFileWithdrawals = new Scanner("withdrawals.txt");

    // sum all lines in file and setting value in saving account
    //double totalWithdrawls = Files.lines(withdrawlsPath).mapToDouble(Double::valueOf).sum();

    savingsAccount.withdraw(totalWithdrawls);

    // Get the balance before adding interest.
    double priorBalance = savingsAccount.getAccountBalance();

    // Add the interest.
    savingsAccount.addInterest();

    // Get the interest earned.
    double interestEarned = savingsAccount.getLastAmountOfInterestEarned();

    // Create a DecimalFormat object for formatting output.
    DecimalFormat dollar = new DecimalFormat("0.00");

    // Show user interest earned and balance.
    System.out
            .println("Interest earned: $" + dollar.format(interestEarned));

    System.out.println("Prior balance: $" + dollar.format(priorBalance));

    System.out.println("Ending balance: $" + dollar.format(SavingsAccount.getAccountBalance()));

}
    
}
