package com.syntax.homeworks.stringsManipulations;

public class Task2 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String str = "Sunday";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
	}

}
