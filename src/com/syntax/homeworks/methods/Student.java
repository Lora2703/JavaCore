package com.syntax.homeworks.methods;

import java.util.Scanner;

public class Student {
	//Create  class Student that will have a method getGrade. Your method should accept 
	//the score of a student and return a grade:
//	score > 90 - A
//	score >80 - B
//	score >70 - C
//	score > 50 - D
//	anything else - F
	int score;
	
	char grade(int score) {
		char grade;
		if(score>90) {
			grade = 'A';
		}else if(score>80 && score<=90) {
			grade = 'B';
		} else if(score>70 && score<=80) {
			grade = 'C';
		} else if(score>50 && score<=70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score");
		int score = scanner.nextInt();
		Student student = new Student();
		char grade = student.grade(score);
		System.out.println("Student has score "+score+" and grade "+grade);

	}

}
