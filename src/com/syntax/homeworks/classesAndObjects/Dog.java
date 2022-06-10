package com.syntax.homeworks.classesAndObjects;

public class Dog {
	String name;
	String breed;
	int age;
	char gender;
	String color;

	public static void main(String[] args) {
		// Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
		
		Dog husky = new Dog();
		husky.name = "Volf";
		husky.breed = "Husky";
		husky.age = 7;
		husky.gender = 'm';
		husky.color = "grey";
		
		Dog bulldog = new Dog();
		bulldog.name = "Bulka";
		bulldog.breed = "Bulldog";
		bulldog.age = 5;
		bulldog.gender = 'f';
		bulldog.color = "black";
		
		Dog labrador = new Dog();
		labrador.name = "Sharik";
		labrador.breed = "Labrador";
		labrador.age = 3;
		labrador.gender = 'm';
		labrador.color = "gold";

	}

}
