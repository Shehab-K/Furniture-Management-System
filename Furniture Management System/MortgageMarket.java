import java.util.List;
import java.util.ArrayList;

public class MortgageMarket {
    // Create a constructor to initialize MortgageMarket' objects.
    // Create a list of methods to get and retrieve MortgageMarket's information.
    // MortgageMarket usually has the following type of information:

    /*
    * Borrowers
    * Lenders
    * Properties
    * */
    
    private int borrowers;
    private int lenders;
    private int properties;
    private List<Application> applications;
    
    
    public MortgageMarket(int borrowers ,int lenders,int properties){
       this.borrowers=borrowers;
       this.lenders=lenders;
       this.properties=properties;
       this.applications = new ArrayList<>();
    }
    
    
    
    private String getBorrowers(String borrowers){
    return borrowers;
    }
    
      private String getLenders(String lenders){
    return lenders;
    }
    
      private String getproperties(String properties){
    return properties ;
    }
    
    public void addApplication(Application application) {
        applications.add(application);
    }

}
