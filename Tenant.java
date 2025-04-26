import java.util.ArrayList;
import java.util.List;

public class Tenant {

    private User user;
    private List<Contract> listOfContract;

    public Tenant(User user) {
        this.user = user;
        this.listOfContract = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Contract> getListOfContract() {
        return listOfContract;
    }

    public void setListOfContract(List<Contract> listOfContract) {
        this.listOfContract = listOfContract;
    }

    // Method to request creating a rental contract
    public void requestCreateRentalContract(Contract contract) {
        listOfContract.add(contract);
        System.out.println("Rental contract created.");
    }

    // Method to request terminating a rental contract
    public void requestTerminateRentalContract(Contract contract) {
        if (listOfContract.remove(contract)) {
            System.out.println("Rental contract terminated.");
        } else {
            System.out.println("Contract not found.");
        }
    }
}
