/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
/**
 *
 * @author Daniel García
 * 10 dic 2023
 */
public class ManageDB {
    private static Connection conn = null;
    
    public static Connection setConnection(){
        String user = "root";
        String pwd = "";
        String dbName = "climateChangeQuiz";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        
        try{
            conn = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException sqlE){
            System.out.println("Connectiong error: " + sqlE);
        }catch(Exception e){
            System.out.println("Exception Error: " + e);
        }
        return conn;
    }
    
    public void createDB(){
        //First connection with no password to create database in case it doesn't exist
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pwd = "";
        try{
            conn = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException sqlE){
            System.out.println("Connectiong error: " + sqlE);
        }catch(Exception e){
            System.out.println("Exception Error: " + e);
        }
        
        try{
            String query = "CREATE DATABASE IF NOT EXISTS climateChangeQuiz";
            Statement st = conn.createStatement();
            st.execute(query);
            st.close();
        }catch(SQLException e)
        {
            System.out.println("Error: " + e);
        }
        
        //Once the database is created, it sets the connection to it
        String dbName = "climateChangeQuiz";
        user = "root";
        pwd = "";
        url = "jdbc:mysql://localhost:3306/" + dbName;
        
        try{
            conn = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException sqlE){
            System.out.println("Connectiong error: " + sqlE);
        }catch(Exception e){
            System.out.println("Exception Error: " + e);
        }
    }
    
    public void createTables(){
        try{
            String tblUsers = "CREATE TABLE IF NOT EXISTS users(userID INT PRIMARY KEY, userName VARCHAR(100) NOT NULL, password VARCHAR(100) NOT NULL, score INT, firstName VARCHAR(100), lastName VARCHAR(200), email VARCHAR(200), role VARCHAR(50), age INT)";
            Statement st = conn.createStatement();
            st.execute(tblUsers);
            st.close();
        }catch(SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
    
    public void insertUsers(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResource("login_details/users.csv").openStream()))) {
            String line;
            int lineCounter = 0;
            while ((line = br.readLine()) != null) {
                if(lineCounter == 0){
                    //If it is the first line, jumps the while loop to not read titles
                    lineCounter++;
                    continue;
                }
                lineCounter++;
                String[] values = line.split(","); //Split by comma delimiter
                //email,userName,userPass,role,userID,firstName,lastName,age,adminID
                String email = values[0];
                String userName = values[1];
                String userPass = values[2];
                String role = values[3];
                int userID = Integer.parseInt(values[4]);
                String firstName = values[5];
                String lastName = values[6];
                int age = Integer.parseInt(values[7]);
                
                try{
                    String selUsers = "SELECT userID from users where userID=" + userID;
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(selUsers);
                    if(!rs.next())
                    {
                        //Id is not set
                        String queryIns = "INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?)";
                        try{
                            //Create prepared statement
                            PreparedStatement pstmt = conn.prepareStatement(queryIns);
                            //Set variables for table: userID, userName, password, score, firstName, lastName, email, role, age
                            pstmt.setInt(1, userID);
                            pstmt.setString(2, userName);
                            pstmt.setString(3, userPass);
                            pstmt.setNull(4, Types.NULL);
                            pstmt.setString(5, firstName);
                            pstmt.setString(6, lastName);
                            pstmt.setString(7, email);
                            pstmt.setString(8, role);
                            pstmt.setInt(9, age);

                            pstmt.execute();
                            //Close statement after use
                            pstmt.close();
                        }catch(SQLException e)
                        {
                            System.out.println("Error: " + e);
                        }
                    }
                    st.close();
                }catch(SQLException e)
                {
                    System.out.println("Error in select: " + e);
                }
                
                

            }
            
            if(lineCounter == 0){
                System.out.println("There are no users in the file");
            }
        }catch(IOException e){
            System.out.println("Error when reading users.csv: " + e);
        }
    }
    
    public void updateScore(int userID, int score){
        try{
            String tblUsers = "UPDATE users SET score = " + score + " WHERE userID = " + userID;
            Statement st = conn.createStatement();
            st.executeUpdate(tblUsers);
            st.close();
        }catch(SQLException e)
        {
            System.out.println("Error in update: " + e);
        }
    }
    
}
