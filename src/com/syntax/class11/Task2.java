package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;

		scan = new Scanner(System.in);
		System.out.println("Please enter username");
		username = scan.nextLine();

		System.out.println("Please enter password");
		password = scan.nextLine();

		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if (!password.contains(username)) {
					
					System.out.println("Please confirm password");
					confirmedPassword=scan.nextLine();
					
					if(password.contentEquals(confirmedPassword)) {
						System.out.println("Your account is created");
					}else {
						System.out.println("Passwords are not matched");
					}
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				String message = "Password is too short";
			}
			System.out.println("Username and password cannot be empty");

		}

	}

}
