public class Client {
    int idCounter = 0;
    int userId;
    String email;
    String password;
    String userType;

    public Client(String email, String password, String userType) {
        this.userId = ++idCounter;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public boolean resetPassword(String curPassword, String newPassword) {
        if (!curPassword.equals(this.password)) {
            return false;
        }

        this.password = newPassword;
        return true;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        if (userType == null) {
            return;
        }

        this.userType = userType;
    }

    public int getUserID(){
        return this.userId;
    }
}