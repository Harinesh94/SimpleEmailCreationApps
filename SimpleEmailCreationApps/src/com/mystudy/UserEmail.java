package com.mystudy;

import java.util.Scanner;

public class UserEmail {
	public String firstName;
	public String lastName;
	public String department;
	public String company;
	
	public UserEmail(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void getUserDept() {
		System.out.println("Enter your DepartmentName");
		Scanner userdept = new Scanner(System.in);
		String dept = userdept.nextLine();
		department = dept;
	}
	
	public void getUserCompany() {
		System.out.println("Enter your CompanyName");
		Scanner userComp = new Scanner(System.in);
		String userCompany = userComp.nextLine();
		company = userCompany;
	}
	
	public void generateEmail() {
		String email = firstName + lastName + "@" + company + "." + "com";
		System.out.println("The Newly Created Email based on Your Details :" +email);
	}
	
	public String  generateRandomPasword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char [] password = new char [length];
		for(int i=0;i <length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
}

