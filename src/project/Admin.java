package project;

public class Admin extends User {
    int adminID;

    public Admin(String email, String userName, String userPass, String role, int adminID) {
        super(email, userName, userPass, role);
        this.adminID = adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

}
