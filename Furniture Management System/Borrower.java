import java.util.Date;

public class Borrower {
    
    private String name;
    private int SSN;
    private int phone;
    private Date DOB;
    private Employment employment;
    private int income;
    public Assets assets;
    private Debts debts;
    private CreditHistory creditHistory;

    
    public Borrower(String name, int SSN, int phone, Date DOB, Employment employment, int income, Assets assets, Debts debts, CreditHistory creditHistory) {
        this.name = name;
        this.SSN = SSN;
        this.phone = phone;
        this.DOB = DOB;
        this.employment = employment;
        this.income = income;
        this.assets = assets;
        this.debts = debts;
        this.creditHistory = creditHistory;
    }


    public String getName() {
        return name;
    }

    public int getSsn() {
        return SSN;
    }

    public int getPhone() {
        return phone;
    }

    public Date getDob() {
        return DOB;
    }

    public Employment getEmployment() {
        return employment;
    }

    public int getIncome() {
        return income;
    }

    public Assets getAssets() {
        return assets;
    }

    public Debts getDebts() {
        return debts;
    }

    public CreditHistory getCreditHistory() {
        return creditHistory;
    }
}