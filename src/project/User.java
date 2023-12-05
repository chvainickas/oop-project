package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

class User {
    String email;
    String userName;
    String userPass;
    String role;

    public User(String email, String userName, String userPass, String role) {
        this.email = email;
        this.userName = userName;
        this.userPass = userPass;
        this.role = role;
    }

    public void register() {
        try (FileWriter csvWriter = new FileWriter("/home/edward/workspace/oop-project/src/project/users.csv", true)) {
            // Appending user details to the CSV file
            csvWriter.append(email).append(",");
            csvWriter.append(userName).append(",");
            csvWriter.append(userPass).append(",");
            csvWriter.append(role);
            csvWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error writing to CSV file.");
        }
    }

}
