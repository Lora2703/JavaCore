package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {

		String name = new String ("Oleg");
		
		String name1 = "Oleg";
		
		//All the classes in Java can be treated as data types
		//if a class is present inside the same package or is the class
		//belongs to Java.lang package
		
		System.out.println(name.length());
		
		String captain = "NAVEED";
		System.out.println(captain.toLowerCase());
		captain = "I love Java";
		System.out.println(captain.toUpperCase());
		

	}

}
