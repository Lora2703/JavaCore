package com.syntax.homeworks.stringsManipulations;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		if(str.isEmpty()) {
			System.out.println("String is empty");			
		} else if(str.length()%2!=0 && str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
		} else {
			System.out.println("The number of characters is even");
		}	
		scanner.close();
	}

}
