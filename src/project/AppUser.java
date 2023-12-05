package project;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AppUser extends User {
    int userID;
    String firstName;
    String lastName;
    int age;
    boolean termsAndConditions;

    public AppUser(String email, String userName, String userPass, String role, int userID, String firstName,
            String lastName,
            int age, boolean termsAndConditions) {
        super(email, userName, userPass, role);
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.termsAndConditions = termsAndConditions;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    @Override
    public void register() {
        try (FileWriter csvWriter = new FileWriter("/home/edward/workspace/oop-project/src/project/users.csv", true)) {
            // Appending user details to the CSV file
            csvWriter.append(email).append(",");
            csvWriter.append(userName).append(",");
            csvWriter.append(userPass).append(",");
            csvWriter.append(role).append(",");
            csvWriter.append(Integer.toString(userID)).append(",");
            csvWriter.append(firstName).append(",");
            csvWriter.append(lastName).append(",");
            csvWriter.append(Integer.toString(age)).append(",");
            csvWriter.append(Boolean.toString(termsAndConditions));
            csvWriter.append("\n");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
