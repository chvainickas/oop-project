package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Admin extends User {

    public Admin(String email, String userName, String userPass, String role, int userID, String firstName,
            String lastName,
            int age) {
        super(email, userName, userPass, role, userID, firstName, lastName, age);
    }
    public static void removeUserFromCSV(int userID) {
        String filePath = "src/project/users.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = br.lines().collect(Collectors.toList()); // reads all lines into the list

            // finds the line with the specified userID
            lines.removeIf(line -> {
                String[] parts = line.split(",");
                if (parts.length >= 5) { // makes sure there is at least 5 fields in the csv
                    int currentUserID;
                    try {
                        currentUserID = Integer.parseInt(parts[4].trim());
                    } catch (NumberFormatException e) {
                        // if no userID don't remove anything
                        return false;
                    }

                    return currentUserID == userID;
                }
                return false;
            });

            // writes the new users into csv after change
            try (FileWriter writer = new FileWriter(filePath)) {
                for (String line : lines) {
                    writer.write(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
