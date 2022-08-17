package com.class4;

import java.util.Scanner;

public class ScannerDemo4 {

	public static void main(String [] shah ) {
		
		Scanner scan =  new Scanner (System.in);
		System.out.println("What is your age please ?");
		int CustomerAge = scan.nextInt();
		
		if(CustomerAge >= 18) {
			System.out.println("You are eligible for license !");
		}else {
			System.out.println("get a learner permit");
		}
	}
		
}