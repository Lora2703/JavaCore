package com.syntax.homeworks.methods;

import java.util.Scanner;

public class Task4 {
	//Create a method that will say Hello in different language based on the country
	//that will passed when method is executed
	void sayHello(String country) {
		country = country.toLowerCase();
		String greeting;
		switch (country) {
		case "ukraine":
			greeting = "Привіт";
			break;
		case "poland":
			greeting = "Dzen dobry";
			break;
		case "england":
			greeting = "Hello";
			break;
		case "france":
			greeting = "Bonjour";
			break;
		case "italy":
			greeting = "Ciao";
			break;
		default:
			greeting = "I don't know such greeting";			
		}
		System.out.println(greeting);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String country = scanner.nextLine();
		Task4 task = new Task4();
		task.sayHello(country);
		scanner.close();

	}

}
