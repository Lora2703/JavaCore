package com.syntax.homeworks.classesAndObjects;

public class Phone {
	String name;
	String manufacturer;
	double screenSize;
	String cpu;
	String os;
	
	void call() {
		System.out.println("Call");
	}

	public static void main(String[] args) {
		// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung 
		//with specific  attributes and behaviors.

		Phone iPhone = new Phone();
		iPhone.name = "13";
		iPhone.manufacturer = "Apple";
		iPhone.screenSize = 6.1;
		iPhone.cpu = "A15 Bionic";
		iPhone.os = "iOS";
		
		Phone pixel = new Phone();
		pixel.name = "6 Pro";
		pixel.manufacturer = "Google";
		pixel.screenSize = 6.1;
		pixel.cpu = "Google Tensor";
		pixel.os = "Android 11";
		
		Phone samsung = new Phone();
		samsung.name = "Galaxy M12";
		samsung.manufacturer = "Samsung";
		samsung.screenSize = 6.5;
		samsung.cpu = "Exynos 850";
		samsung.os = "Android 12";
				
	}

}
