package Contract;

public class Client {
    public static void main(String[] args) {
        Contract longTerm = new LongTerm().BuildContractID(0).BuildPropertyID(1).BuildTenantID(1).BuildRentAmount(1000).SignContract();
        Contract permanent = new Permanent().BuildContractID(2).BuildPropertyID(0).BuildTenantID(2).BuildRentAmount(20400).SignContract();

        System.out.println("Long Term Contract: " + longTerm);
        System.out.println("Permanent Contract: " + permanent);
    }
}
