

    // create a constructor to initialize ProcessedApplication's objects.
    // and a list of methods to get and retrieve ProcessedApplication' information.
    // Including all information about Application,
    // ProcessedApplication usually have the following type of information


    /*
    * Status (Approved or rejected)
    * LoanEstimate

  // Define a method to determine status based on the following:
 //   if total debts >= total assets
 //   or total debts/total income > Debt-to-income (DTI) ratio (of the lender)
 //   or if there is any outstanding judgments against borrower
    //or borrower has been declared bankrupt within the past 7 years.
    //or borrower had property foreclosed upon or given title or deed in lieu thereof in the last 7 years
    //or borrower is a party to a lawsuit
    //or borrower has  directly or indirectly been obligated on any loan which resulted in foreclosure, transfer of title in lieu of foreclosure, or judgment.


    // Define a method to create the LoanEstimate (if status is approved) based on
    // the information of property's price, lender fees, interest rate
    // otherwise (status is rejected) LoanEstimate attributes will be -1 (a number to declare rejection status)
*/

public class ProcessedApplication extends Application {
    
    private String status;
    private double loanEstimate;
    private double totalPrice;
    private ClosingDisclosure closingDisclosure;

    
    public ProcessedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property, String status, double totalPrice) {
        super(applicationNumber, borrower, lender, property); 
        this.status = determineStatus(); 
        this.loanEstimate = createLoanEstimate(); 
        this.totalPrice = totalPrice;
    }

    
    public String getStatus() {
        return status;
    }

    public double getLoanEstimate() {
        return loanEstimate;
    }

   public double getTotalPrice() {
        return totalPrice;
    }
    
    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }

    
    public String determineStatus() {
         
        double totalDebts = getBorrower().getDebts().getCurrentMortgage() +
                            getBorrower().getDebts().getLiens() +
                            getBorrower().getDebts().getAlimony() +
                            getBorrower().getDebts().getChildSupport() +
                            getBorrower().getDebts().getCarLoans() +
                            getBorrower().getDebts().getCreditCards() +
                            getBorrower().getDebts().getRealEstateTaxes() +
                            getBorrower().getDebts().getHomeownerAssociationDues() +
                            getBorrower().getDebts().getHazardInsurance();
        double totalAssets = getBorrower().getAssets().getTotalValue();
        double totalIncome = getBorrower().getIncome();
        double DTIRatio = getLender().getDebtToIncomeRatio();

        if (totalDebts >= totalAssets || totalDebts / totalIncome > DTIRatio) {
            return "Rejected";
        } else {
            return "Approved";
        }
        
    }

   
   private double createLoanEstimate() {
        String status = determineStatus(); 

        if (status.equals("Approved")) {
            
            double propertyPrice = getProperty().getExpectedSalesPrice(); 
            double lenderFees = getLender().getLenderFees(); 
            double interestRate = getLender().getInterestRate();
            double loanEstimate = propertyPrice - lenderFees; 
            
            totalPrice = loanEstimate;

            return loanEstimate;
        } else {
            
            return -1;
        }
    }
}


