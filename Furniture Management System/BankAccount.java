
// create a constructor to initialize BankAccount's objects.
// and a list of methods to get and retrieve BankAccount' information.
// BankAccount usually have the following type of information
/*
 * •    Account number
•    Account type, such as a checking, savings, individual retirement account (IRA), or certificate of deposit (CD)
•    Open or closed status and open date
•    Account holder names, which are the authorized signers on the account.
•    Balance information, including current balance as well as average balance history over the last two statement periods.
•    Current interest rate (if applicable) as well as interest paid over the two most recent statement periods.
•    Account closed date and the balance at the close (if applicable)
*/
import java.util.List;

public class BankAccount {
    
    private int accountNumber;
    private List<String> accountTypes;
    private boolean isOpen;
    private String openDate;
    private String[] accountHolderNames;
    private double currentBalance;
    private double averageBalanceLastTwoStatementPeriods;
    private double currentInterestRate;
    private double interestPaidLastTwoStatementPeriods;
    private String closedDate;
    private double balanceAtClose;

    
    public BankAccount(int accountNumber, List<String> accountTypes, boolean isOpen, String openDate, String[] accountHolderNames, double currentBalance, double averageBalanceLastTwoStatementPeriods, double currentInterestRate, double interestPaidLastTwoStatementPeriods, String closedDate, double balanceAtClose) {
        this.accountNumber = accountNumber;
        this.accountTypes = accountTypes;
        this.isOpen = isOpen;
        this.openDate = openDate;
        this.accountHolderNames = accountHolderNames;
        this.currentBalance = currentBalance;
        this.averageBalanceLastTwoStatementPeriods = averageBalanceLastTwoStatementPeriods;
        this.currentInterestRate = currentInterestRate;
        this.interestPaidLastTwoStatementPeriods = interestPaidLastTwoStatementPeriods;
        this.closedDate = closedDate;
        this.balanceAtClose = balanceAtClose;
    }

  
    public int getAccountNumber() {
        return accountNumber;
    }

    public List<String> getAccountTypes() {
        return accountTypes;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getOpenDate() {
        return openDate;
    }
    
    public double getCurrentBalance() {
        return currentBalance;
    }

}





