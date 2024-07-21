
    // create a constructor to initialize LoanEstimate's objects.
    // and a list of methods to get and retrieve LoanEstimate's information.
    // LoanEstimate usually have the following type of information

    /*
    Applicant_Name (the Borrower's name)
    Loan_amount
    Loan_Term
    Interest_rate
    Monthly_Principal_AND_Interest
    Mortgage_Insurance
    Estimated_Escrow
    Estimated_Total_Monthly_Payment (Monthly_Principal_AND_Interest + Mortgage_Insurance + Estimated_Escrow)
    * */

    // Define a method that calculates the Estimated_Total_Monthly_Payment based on the information
    // of Loan_amount, Loan_Term, Interest_rate
public class LoanEstimate {

    private String applicantName;
    private double loanAmount;
    private int loanTerm;
    private double interestRate;
    private double monthlyPrincipalAndInterest;
    private double mortgageInsurance;
    private double estimatedEscrow;
    private double estimatedTotalMonthlyPayment;

    public LoanEstimate(Borrower borrower, double loanAmount, int loanTerm, double interestRate,
                    double monthlyPrincipalAndInterest, double mortgageInsurance, double estimatedEscrow) {
    this.applicantName = borrower.getName();
    this.loanAmount = loanAmount;
    this.loanTerm = loanTerm;
    this.interestRate = interestRate;
    this.monthlyPrincipalAndInterest = monthlyPrincipalAndInterest;
    this.mortgageInsurance = mortgageInsurance;
    this.estimatedEscrow = estimatedEscrow;
    this.estimatedTotalMonthlyPayment = calculateEstimatedTotalMonthlyPayment();
}


    public String getApplicantName() {
        return applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    public double getMortgageInsurance() {
        return mortgageInsurance;
    }

    public double getEstimatedEscrow() {
        return estimatedEscrow;
    }

    public double getEstimatedTotalMonthlyPayment() {
        return estimatedTotalMonthlyPayment;
    }

    private double calculateEstimatedTotalMonthlyPayment() {
        return monthlyPrincipalAndInterest + mortgageInsurance + estimatedEscrow;
    }
}
    
    
    
    
    

