import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    // Attributes
    private Client user; // Liên kết với class User
    private List<Property> listOfProperties; // Danh sách các Property mà PropertyOwner sở hữu

    // Constructor
    public PropertyOwner(Client user) {
        this.user = user;
        this.user.setUserType("PropertyOwner");
        this.listOfProperties = new ArrayList<>();
    }

    // Getter và Setter
    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }

    // Methods
    public void addProperty(Property property) {
        if (property != null && !listOfProperties.contains(property)) {
            property.setPropertyOwnerId(user.userId);
            listOfProperties.add(property);
        }
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    @Override
    public String toString() {
        return "PropertyOwner{" +
                "user=" + user +
                ", numberOfProperties=" + listOfProperties.size() +
                '}';
    }
}