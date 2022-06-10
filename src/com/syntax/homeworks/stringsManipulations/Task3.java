package com.syntax.homeworks.stringsManipulations;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*Write a program that reads two people's first
		 names and if they expecting boy or girl? 
		Based on the input suggests a name for a baby:
		Example Output:
		Mom's first name? Mary
		Dad's first name? Daniel
		Boy or Girl? boy
		Suggested baby name: DANRY

		Example Output:
		Mom's first name? Mary
		Dad's first name? Daniel
		Boy or Girl? girl
		Suggested baby name: MAIEL*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter mom's first name");
		String momsName = scanner.nextLine();
		System.out.println("Enter dad's first name");
		String dadsName = scanner.nextLine();
		System.out.println("Boy or girl?");
		String gender = scanner.nextLine();
		String babyName;
		
		if(gender.equals("boy")) {
			babyName = dadsName.substring(0, dadsName.length()/2).concat(momsName.substring(momsName.length()/2));
		} else {
			babyName = momsName.substring(0, momsName.length()/2).concat(dadsName.substring(dadsName.length()/2));
		}
		System.out.println("suggested baby name is "+babyName.toUpperCase());
		

	}

}
