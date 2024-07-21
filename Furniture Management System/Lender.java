public class Lender {
    // create a constructor to initialize Lender's objects.
    // and a list of methods to get and retrieve Lender' information.
    // Lender usually have the following type of information

    /*
* Lender Number
* Debt-to-income (DTI) ratio
* Down payment requirement
* Interest rate
* Lender fees
* Closing costs
* */


    private double lenderNumber;
    private double debtToIncomeRatio;
    private double downPaymentRequirement;
    private double interestRate;
    private double lenderFees;
    private double closingCosts;

    public Lender(double lenderNumber, double debtToIncomeRatio, double downPaymentRequirement, double interestRate, double lenderFees, double closingCosts) {
        this.lenderNumber = lenderNumber;
        this.debtToIncomeRatio = debtToIncomeRatio;
        this.downPaymentRequirement = downPaymentRequirement;
        this.interestRate = interestRate;
        this.lenderFees = lenderFees;
        this.closingCosts = closingCosts;
    }

  
    public double getLenderNumber() {
        return lenderNumber;
    }

    public double getDebtToIncomeRatio() {
        return debtToIncomeRatio;
    }

    public double getDownPayment() {
        return downPaymentRequirement;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getLenderFees() {
        return lenderFees;
    }

    public double getClosingCosts() {
        return closingCosts;
    }
}
