package CodeSmell;

import java.util.List;
import java.util.ArrayList;

class PropertyOwner {
    String ownerName;
    String location;

    PropertyOwner(String ownerName, String location){
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

class Property {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    public Property(String name, double rentAmount, PropertyOwner propertyOwner) {
        // Constructor with a data clump
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = propertyOwner.getOwnerName();
        this.location = propertyOwner.getLocation();
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            property.printPropertyDetails();
            totalRent += property.getRentAmount();
            if (property.getRentAmount() > 2000) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }
            double yearlyRent = property.getRentAmount() * 12;
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("--------------------");
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        PropertyOwner owner1 = new PropertyOwner("John Doe", "City Center");
        PropertyOwner owner2 = new PropertyOwner("Jane Smith", "Suburb");
        PropertyOwner owner3 = new PropertyOwner("Bob Johnson", "Downtown");

        Property property1 = new Property("Apartment A", 1500.0, owner1);
        Property property2 = new Property("House B", 2000.0, owner2);
        Property property3 = new Property("Condo C", 1800.0, owner3);
        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        financialReport.generateReport();
    }
}
