package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number ");
		number = input.nextInt();
		 
		if(number > 1 && number < 20) {
			System.out.println("you entered samll number");
		}else if(number > 20 && number <= 100){
			System.out.println("your entered medium number ");
		}else if(number > 100 && number <= 1000 ) {
			System.out.println("you enterd larger number");
		}

	}

}
