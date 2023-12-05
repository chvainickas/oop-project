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
	public static void main(String[] args) throws IOException {
		AppUser newUser = new AppUser("user@example.com", "username", "password", "Regular", 1, "John", "Doe", 25,
				true);
		newUser.register();
		JOptionPane.showMessageDialog(null, "Registration successful!");
	}

}
