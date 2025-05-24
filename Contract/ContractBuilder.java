package Contract;
public interface ContractBuilder {
    ContractBuilder BuildContractID(int contractId);
    ContractBuilder BuildPropertyID(int propertyId);
    ContractBuilder BuildTenantID(int tenantId);
    ContractBuilder BuildRentAmount(double rentAmount);
    Contract SignContract();
}
