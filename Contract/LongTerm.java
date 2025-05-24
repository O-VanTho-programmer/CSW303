package Contract;
public class LongTerm implements ContractBuilder {
    int contractId;
    double rentAmount;
    int propertyId;
    int tenantId;

    @Override
    public ContractBuilder BuildContractID(int contractId) {
        this.contractId = contractId;
        return this;
    }

    @Override
    public ContractBuilder BuildPropertyID(int propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    @Override
    public ContractBuilder BuildTenantID(int tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @Override
    public ContractBuilder BuildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract SignContract() {
        return new Contract(contractId, rentAmount, propertyId, tenantId);
    }

}
