public class ClosedApplication extends ProcessedApplication {
    // Constructor to initialize ClosedApplication's objects
    // and a list of methods to get and retrieve ClosedApplication' information
    // Including all information about ProcessedApplication
    // ClosedApplication usually have the following type of information
    /*
    * ClosingDisclosure
    */
    private ClosingDisclosure closingDisclosure;

    public ClosedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property,
                             String status, double totalPrice, ClosingDisclosure closingDisclosure) {
        super(applicationNumber, borrower, lender, property, status, totalPrice);
        this.closingDisclosure = closingDisclosure;
    }

    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }
}

