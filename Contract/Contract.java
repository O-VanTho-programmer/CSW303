package Contract;
public class Contract {
    private int contractId;
    private double rentAmount;
    private int propertyId;
    private int tenantId;

    public Contract(int contractId, double rentAmount, int propertyId, int tenantId) {
        this.contractId = contractId;
        this.rentAmount = rentAmount;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
            return "Contract ID: " + contractId + ", Rent Amount: " + rentAmount + ", Property ID: " + propertyId + ", Tenant ID: " + tenantId;
    }
}
