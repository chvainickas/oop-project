package project;

public class Admin extends User {
    int adminID;

    public Admin(String email, String userName, String userPass, int adminID) {
        super(email, userName, userPass);
        this.adminID = adminID;
    }

}
