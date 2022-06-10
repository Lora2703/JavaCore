package com.syntax.class14;

public class MethodsDemo3 {
	// write a method that takes an int value. If that value is even
	//return true, otherwise - false
	
	boolean isEven(int number) {
		if(number%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	//write a method that takes a String and return true if a number of
	//characters are even
	
	boolean isNumberOfCaractersEven(String str) {		
		if(str.length()%2==0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(2));
		
		MethodsDemo3 md1 = new MethodsDemo3();
		System.out.println(md1.isNumberOfCaractersEven("pod"));
	}

}
