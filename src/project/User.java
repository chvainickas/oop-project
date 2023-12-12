package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class User {
    String email;
    String userName;
    String userPass;
    String role;
    int userID;
    String firstName;
    String lastName;
    int age;
    User[] users;

    public User(String email, String userName, String userPass, String role, int userID, String firstName,
            String lastName, int age) {
        this.email = email;
        this.userName = userName;
        this.userPass = userPass;
        this.role = role;
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public static boolean login(String inputUsername, String inputPassword) {
        String filePath = "src/project/users.csv"; // directory to file path

        try (BufferedReader csvReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = csvReader.readLine()) != null) {
                String[] fields = line.split(","); // splits the csv into fields
                if (fields.length >= 3 && fields[1].equals(inputUsername) && fields[2].equals(inputPassword)) { // checks
                                                                                                                // the
                                                                                                                // logins
                                                                                                                // from
                                                                                                                // based
                                                                                                                // off
                                                                                                                // the
                                                                                                                // csv
                                                                                                                // file
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading from CSV file.");
        }
        return false;
    }

}
