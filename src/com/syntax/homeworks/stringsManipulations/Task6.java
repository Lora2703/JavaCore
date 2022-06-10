package com.syntax.homeworks.stringsManipulations;

public class Task6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?

		String str1 = "First";
		String str2 = "Second";
		
		str1 = str1.concat(str2);
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
