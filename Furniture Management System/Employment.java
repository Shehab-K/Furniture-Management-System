
    // Create a constructor to initialize Employment objects.
    // and create a list of methods to get and retrieve the Employment's information.
    // Information about the Employment usually contains the following:
    /*
   • Name of current employer, phone, and street address
   • Length of time at current employer
   • Position/title
   • Salary including overtime, bonuses, or commissions
    * */
public class Employment {

    private String employerName;
    private int phone;
    private String streetAddress;
    private int timeAtCurrentEmployer; 
    private String position;
    private double salary; 
    private Income income;

    public Employment(String employerName, int phone, String streetAddress, int timeAtCurrentEmployer, String position, double salary) {
        this.employerName = employerName;
        this.phone = phone;
        this.streetAddress = streetAddress;
        this.timeAtCurrentEmployer = timeAtCurrentEmployer;
        this.position = position;
        this.salary = salary;
        this.income = income;
    }

    public String getEmployerName() {
        return employerName;
    }

    public int getPhone() {
        return phone;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getTimeAtCurrentEmployer() {
        return timeAtCurrentEmployer;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    
    public Income getIncome() {
       return income; 
    }
}
