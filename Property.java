public class Property {
    int idCounter = 0;
    int propertyId;
    String description;
    int propertyOwnerId;

    public Property(String description, int propertyOwnerId){
        propertyId = ++idCounter;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }
}
