import java.util.List;
public class Property {

   // create a constructor to construct property objects,
    // and a list of methods to get and retrieve the property's information
    //
   //   Properties usually have the following type of information:
   /*
   • Street address
   • Expected sales price
   • Type of home (single-family residence, condo, etc.)
   • Size of property
   • Real estate taxes (annual)
   • Homeowner’s association dues (HOA)
    */



    
    private String streetAddress;
    private double expectedSalesPrice;
    private List<String> typesOfHome; 
    private double sizeOfProperty;
    private double realEstateTaxes;
    private double homeownerAssociationDues;


   
    public Property(String streetAddress, double expectedSalesPrice, List<String> typesOfHome, double sizeOfProperty, double realEstateTaxes, double homeownerAssociationDues) {
        this.streetAddress = streetAddress;
        this.expectedSalesPrice = expectedSalesPrice;
        this.typesOfHome = typesOfHome;
        this.sizeOfProperty = sizeOfProperty;
        this.realEstateTaxes = realEstateTaxes;
        this.homeownerAssociationDues = homeownerAssociationDues;
    }

  
    public String getStreetAddress() {
        return streetAddress;
    }

    public double getExpectedSalesPrice() {
        return expectedSalesPrice;
    }

    public List<String> getTypesOfHome() {
        return typesOfHome;
    }

    public double getSizeOfProperty() {
        return sizeOfProperty;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public double getHomeownerAssociationDues() {
        return homeownerAssociationDues;
    }
}
