import java.util.*;

public class Tenant {
    private Client user;
    private List<RentalContract> listOfContracts = new ArrayList<>();

    public Tenant(Client user) {
        this.user = user;
    }

    public void requestCreateRentalContract(String contractID, Property property, double rentAmount) {
        RentalContract contract = new RentalContract(contractID, property.getPropertyId(), user.getUserID(), rentAmount);
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(String contractID) {
        listOfContracts.removeIf(c -> c.getContractID().equals(contractID));
    }
}
