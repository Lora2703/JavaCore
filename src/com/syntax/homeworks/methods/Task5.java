package com.syntax.homeworks.methods;

import java.util.Scanner;

public class Task5 {
	//Create a method createEmail(). Based on values of users name, lastName and email type,
	//your method should return complete email Address. Example:  
	//createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	
	String emailAddress(String name, String lastName, String emailType) {
		name = name.toLowerCase();
		lastName = lastName.toLowerCase();
		return name.concat(lastName)+"@"+emailType+".com";
	}

	public static void main(String[] args) {
		
		Task5 task = new Task5();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scanner.nextLine();
		System.out.println("Enter the last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter the email type");
		String emailType = scanner.nextLine();
		String emailAddress = task.emailAddress(name, lastName, emailType);
		System.out.println(emailAddress);
		scanner.close();

	}

}
