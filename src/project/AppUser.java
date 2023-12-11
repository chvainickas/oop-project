package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AppUser extends User {

    public AppUser(String email, String userName, String userPass, String role, int userID, String firstName,
            String lastName,
            int age) {
        super(email, userName, userPass, role, userID, firstName, lastName, age);
    }

    // converts the java objects into a csv string
    public String toCSVString() {
        return String.format("%s,%s,%s,%s,%d,%s,%s,%d", email, userName, userPass, role, userID, firstName, lastName,
                age);
    }

    // this writes the converted csv string to file
    public void register() {
        try (FileWriter csvWriter = new FileWriter("/home/edward/workspace/oop-project/src/project/users.csv", true)) {
            csvWriter.append(toCSVString()).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }

    static int getNextUserID() {
        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/edward/workspace/oop-project/src/project/users.csv"))) {
            String lastLine = null;
            String currentLine;
            while ((currentLine = br.readLine()) != null) { // iterates to get to last line
                lastLine = currentLine;
            }

            if (lastLine != null) {
                String[] parts = lastLine.split(",");
                if (parts.length >= 5) { // make sure there is user id
                    try {
                        return Integer.parseInt(parts[4].trim()) + 1; // add one to userID
                    } catch (NumberFormatException e) { // if there is no number in userID
                        System.out.println("Skipping line: " + lastLine);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 1; // incase csv is empty
    }
}