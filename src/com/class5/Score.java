package com.class5;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		char grade ;
		int quiz, mid,finalScore, avg;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		quiz = input.nextInt();
		
	    System.out.println("Please enter your mid term score");
	    mid = input.nextInt();
	    
	    System.out.println("Please enter your Final Score ");
	    finalScore =input.nextInt();
	    
	    avg =(quiz + mid +finalScore)/3;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg >= 50 && avg< 70) {
			grade = 'C';
		} else if (avg < 50) {
			grade = 'D';
		}else {
			grade= 'F';
		}
		System.out.println("Your average is "+avg+ " and your is grade is = "+grade);
		
		System.out.println("--------------------------");
		if(grade =='A' || grade == 'B') {
			System.out.println("Your a good student ");
		}else {
			System.out.println("Study harder ");
		}
	}

}
