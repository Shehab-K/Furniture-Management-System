
/**
 * Write a description of class MortgageImplementer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MortgageImplementer implements MLH {
    private MortgageMarket mortgageMarket;

    @Override
    public MortgageMarket initializeMortgageMarket(int numOFBorrowers, int numOFProperties, int numOFLenders) {
        mortgageMarket = new MortgageMarket(numOFBorrowers,numOFProperties,numOFLenders);
        return mortgageMarket;
    }

    
    public Application apply(Borrower b, Property p, Lender l) {
      Application application = new Application(1, b, l, p);
      mortgageMarket.addApplication(application);
      return application;
    }

    @Override
public ProcessedApplication process(Application a) {
    if (mortgageMarket != null) {
        int applicationNumber = a.getApplicationNumber();
        double propertyPrice = a.getProperty().getExpectedSalesPrice();
        double lenderFees = a.getLender().getLenderFees();
        double totalPrice = propertyPrice - lenderFees;
        String status = totalPrice >= 0 ? "Approved" : "Denied";
        return new ProcessedApplication(applicationNumber, a.getBorrower(), a.getLender(), a.getProperty(), status, totalPrice);
    } else {
        System.out.println("Mortgage market not initialized");
        return null;
    }
}
    
    
    @Override
    public ClosedApplication close(ProcessedApplication pa) {
    if (mortgageMarket != null) {
        int applicationNumber = pa.getApplicationNumber();
        Borrower borrower = pa.getBorrower();
        Lender lender = pa.getLender();
        Property property = pa.getProperty();
        String status = pa.getStatus();
        double totalPrice = pa.getTotalPrice();

        // Generate a closing disclosure document
        ClosingDisclosure closingDisclosure = pa.getClosingDisclosure();

        // Create a new ClosedApplication object
        ClosedApplication closedApplication = new ClosedApplication(applicationNumber, borrower, lender, property, status, totalPrice, closingDisclosure);
        return closedApplication;
    } else {
        throw new IllegalStateException("Mortgage market not initialized");
    }
}
    
    public void setMortgageMarket(MortgageMarket mortgageMarket) {
        this.mortgageMarket = mortgageMarket;
    }
    
}
