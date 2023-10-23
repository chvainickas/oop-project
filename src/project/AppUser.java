package project;

public class AppUser extends User {
    int userID;
    String firstName;
    String lastName;
    int age;
    boolean termsAndConditions;

    public AppUser(String email, String userName, String userPass, int userID, String firstName, String lastName,
            int age, boolean termsAndConditions) {
        super(email, userName, userPass);
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.termsAndConditions = termsAndConditions;
    }

}
