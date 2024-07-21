import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMortgage {
    public static void main(String[] args) {
        // Initialize MortgageMarket with one borrower, two lenders, and one property
        MortgageMarket mortgageMarket = new MortgageMarket(1,2,1);
        
       
        Borrower borrower = new Borrower("Karim Ahmed Shehab El Omar", 21019778, 1234567890, new Date(), new Employment("ABC Company", 555-123-4567, "15516", 3, "Construction", 170000), 50000,new Assets(new ArrayList<>(),"House" , new ArrayList<>(), 50000, 1000),new Debts(1500, 0, 200, 300, 400, 1000, 500, 300, 100),new CreditHistory(1, 2, 0, 3));

        // Initialize Lenders
        Lender lender1 = new Lender(1, 0.1, 0.6, 0.06, 1000, 2000);
        Lender lender2 = new Lender(2, 0.2, 0.5, 0.05, 500, 200);

        List<String> typesOfHome = new ArrayList<>();
        typesOfHome.add("Apartment");
        Property property = new Property("123 Property St", 20000, typesOfHome, 2000, 5000, 1000);
        
        
        // Create MortgageImplementer instance
        MortgageImplementer mortgageImplementer = new MortgageImplementer();
        mortgageImplementer.setMortgageMarket(mortgageMarket);

        // Create first application
        Application application1 = mortgageImplementer.apply(borrower, property, lender1);

        // Create second application
        Application application2 = mortgageImplementer.apply(borrower, property, lender2);

        // Process the applications
        ProcessedApplication processedApplication1 = mortgageImplementer.process(application1);
        ProcessedApplication processedApplication2 = mortgageImplementer.process(application2);

        // Get loan costs of the processed applications
        double loanCost1 = processedApplication1.getLoanEstimate();
        double loanCost2 = processedApplication2.getLoanEstimate();

        // Choose the application with the lowest loan costs
        ProcessedApplication chosenProcessedApplication;
        if (loanCost1 < loanCost2) {
            chosenProcessedApplication = processedApplication1;
        } else {
            chosenProcessedApplication = processedApplication2;
        }

        // Close the chosen processed application
        ClosedApplication closedApplication = mortgageImplementer.close(chosenProcessedApplication);

        // Print the details of the closed application
        System.out.println("Closed Application Details:");
        System.out.println("Application Number: " + closedApplication.getApplicationNumber());
        System.out.println("Borrower: " + closedApplication.getBorrower().getName());
        System.out.println("Lender: " + closedApplication.getLender().getLenderNumber());
        System.out.println("Property Address: " + closedApplication.getProperty().getStreetAddress());
        System.out.println("Status: " + closedApplication.getStatus());
        System.out.println("Total Price: " + closedApplication.getTotalPrice());
    }
}