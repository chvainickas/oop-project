package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class User {
    String email;
    String userName;
    String userPass;
    String role;
    User[] users;

    public User(String email, String userName, String userPass, String role) {
        this.email = email;
        this.userName = userName;
        this.userPass = userPass;
        this.role = role;
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

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


    
    public static boolean login(String inputUsername, String inputPassword) {
        String filePath = "/home/edward/workspace/oop-project/src/project/users.csv"; // directory to file path

        try (BufferedReader csvReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = csvReader.readLine()) != null) {
                String[] fields = line.split(",");  // Split the CSV line into fields
                if (fields.length >= 3 && fields[1].equals(inputUsername) && fields[2].equals(inputPassword)) { // checks the logins from based off the csv file
                    return true; // Credentials match
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading from CSV file.");
        }
        return false;
    }

}
