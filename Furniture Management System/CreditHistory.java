public class CreditHistory {
    // Create a constructor to initialize credithistory' objects.
    // Create a list of methods to get and retrieve credithistory' informtion.
    // Credithistory usually has the following type of information:
    /*
   • Bankruptcies
   • Collections
   • Foreclosures
   • Delinquencies
    * */
    
    
    

    
    private int bankruptcies;
    private int collections;
    private int foreclosures;
    private int delinquencies;

 
    public CreditHistory(int bankruptcies, int collections, int foreclosures, int delinquencies) {
        this.bankruptcies = bankruptcies;
        this.collections = collections;
        this.foreclosures = foreclosures;
        this.delinquencies = delinquencies;
    }

    
    public int getBankruptcies() {
        return bankruptcies;
    }

    public int getCollections() {
        return collections;
    }

    public int getForeclosures() {
        return foreclosures;
    }

    public int getDelinquencies() {
        return delinquencies;
    }
}

