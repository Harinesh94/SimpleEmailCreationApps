package com.mystudy;

public class UserMain {

	public static void main(String[] args) {
		UserEmail email = new UserEmail("Harinesh", "Prasath");
		email.getUserDept();
		email.getUserCompany();
		email.generateEmail();
		String password = email.generateRandomPasword(8);
		System.out.println("Your Default Password is "+password);
		System.out.println("Your Alternate  Email address is "+email.getAlternateEmailAddress());
		System.out.println("Thank You for using Our Service to create an Email..");
	}

}
