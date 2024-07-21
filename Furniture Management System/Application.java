public class Application {
    
    public int applicationNumber;
    public Borrower borrower;
    public Lender lender;
    public Property property;
    public double totalAssets;
    public Debts totaldebts;
    public double calculateTotalAssets;

    
    public Application(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        this.applicationNumber = applicationNumber;
        this.borrower = borrower;
        this.lender = lender;
        this.property = property;
        this.totalAssets = calculateTotalAssets(borrower);
        this.totaldebts = totaldebts;
    }

    
    public int getApplicationNumber() {
        return applicationNumber;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Lender getLender() {
        return lender;
    }

    public Property getProperty() {
        return property;
    }

    public  double gettotalAssets() {
        return totalAssets;
    }

    public Debts gettotaldebts() {
        return totaldebts;
    }


    public double calculateTotalAssets(Borrower borrower) {
        Assets borrowerAssets = borrower.getAssets();
        return borrowerAssets.getTotalValue();
    }
    
    
    
}

