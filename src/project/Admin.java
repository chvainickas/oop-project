package project;

public class Admin extends User {
    int adminID;

    public Admin(String email, String userName, String userPass, String role, int adminID) {
        super(email, userName, userPass, role, adminID, role, role, adminID);
    }


}
