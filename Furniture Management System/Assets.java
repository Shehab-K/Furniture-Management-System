
import java.util.List;

 
public class Assets {
    // create a constructor to initialize Assets's objects.
    // and a list of methods to get and retrieve Assets' information.
    // Assets usually have the following type of information
    /*
    • Bank accounts (savings, checking, brokerage accounts)
   • Real property
   • Investments (stocks, bonds, retirement accounts)
   • Proceeds from the sale of your current home
   • Gifted funds from relatives (e.g. a down payment gift for an FHA loan)
   */
    
    private List<BankAccount> bankAccounts;
    private String RealProperty;
    private List<String> investments;
    private double proceedsFromSaleOfHome;
    private double giftedFunds;

    public Assets(List<BankAccount> bankAccounts, String RealProperty,  List<String> investments, double proceedsFromSaleOfHome, double giftedFunds) {
        this.bankAccounts = bankAccounts;
        this.RealProperty = RealProperty;
        this.investments = investments;
        this.proceedsFromSaleOfHome = proceedsFromSaleOfHome;
        this.giftedFunds = giftedFunds;
    }

    
    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public String getRealProperties() {
        return RealProperty;
    }

    public List<String> getInvestments() {
        return investments;
    }

    public double getProceedsFromSaleOfHome() {
        return proceedsFromSaleOfHome;
    }

    public double getGiftedFunds() {
        return giftedFunds;
    }
    
    public double getTotalValue() {
        double total = 0;
        for (BankAccount account : bankAccounts) {
            total += account.getCurrentBalance();
        }
        total += proceedsFromSaleOfHome + giftedFunds;
        return total;
    }
 }




