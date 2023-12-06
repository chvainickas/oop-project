/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author edward
 */
public class ProjectApp {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Example usage of login
		String inputUsername = JOptionPane.showInputDialog("Enter username:");
		String inputPassword = JOptionPane.showInputDialog("Enter password:");

		if (AppUser.login(inputUsername, inputPassword)) {
			JOptionPane.showMessageDialog(null, "Login successful!");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid credentials. Login failed.");
		}
	}

}
