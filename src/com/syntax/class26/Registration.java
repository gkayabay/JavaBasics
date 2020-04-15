package com.syntax.class26;

public class Registration {

	private String email;
	private String userName;
	private String password;

	// created methods to return me
	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {

		if (email.contains("yahoo")) {
			this.email = email;
		} else {
			System.out.println("Please use only yahoo account");

		}
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("Username cannot be empty and length should be more than 6 characters");
		}
	}

	public void setPassword(String password) {

		if (!password.isEmpty()) {

			if (password.length() > 6) {

				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Password cannot be empty");
		}
	}
}
