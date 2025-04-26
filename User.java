public class User {
    int idCounter = 0;
    int userId;
    String email;
    String password;
    String userType;
    
    public User(String email, String password, String userType){
        this.userId = ++idCounter;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public boolean resetPassword(String curPassword, String newPassword){
        if(!curPassword.equals(this.password)){
            return false;
        }

        this.password = newPassword;
        return true;
    }
}