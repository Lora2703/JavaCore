package com.syntax.homeworks.stringsManipulations;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a String");
		String str = scanner.nextLine();
		boolean isPalindrome = true;
		
		str=str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);		
		if(sb.reverse().toString().equals(str)) {
			System.out.println(isPalindrome);
		} else {
			System.out.println(!isPalindrome);
		}
		scanner.close();
		
	}

}
