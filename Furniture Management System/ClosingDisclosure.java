public class ClosingDisclosure {

    // create a constructor to initialize ClosingDisclosure's objects.
    // and a list of methods to get and retrieve ClosingDisclosure's information.
    // ClosingDisclosure usually have the following type of information

    /*
    * Loan_ID
    * Closing_Date
    * ClosingCosts (Average closing costs for the buyer run between about 2% and 6% of the loan amount. )
    * */

    // Define methods to calculate ClosingCosts based on the loan amount

    
    
  
    private int loanID;
    private String closingDate;
    private double closingCosts;

 
    public ClosingDisclosure(int loanID, String closingDate, double closingCosts) {
        this.loanID = loanID;
        this.closingDate = closingDate;
        this.closingCosts = closingCosts;
    }

    
    public int getLoanID() {
        return loanID;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

   
    public double calculateClosingCosts(double loanAmount) {
        
        return 0.06 * loanAmount;
    }
}

