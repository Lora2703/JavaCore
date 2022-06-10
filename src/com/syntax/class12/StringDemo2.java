package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		

		String firstName = "Adem";
		String lastName = "Jones";
		String fullName = firstName + lastName;//always prefer this
		String fullName2 = firstName.concat(lastName);//never use because it can lead to nullpointer execetion
		System.out.println(fullName);
		System.out.println(fullName2);
		
		String name = "";
		System.out.println(name.isEmpty());//true 
	//	System.out.println(name.isBlank());
		
		String str = " never ";
		System.out.println(str.trim());//remove spaces at the beginning an at the end
		
		
	}

}
