public class RentalContract {
    private String contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;

    public RentalContract(String contractID, int propertyID, int tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void terminateContract() {
        System.out.println("Contract " + contractID + " has been terminated.");
    }

    public String getContractID() {
        return contractID;
    }
}
