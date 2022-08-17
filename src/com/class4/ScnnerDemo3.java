package com.class4;

import java.util.Scanner;

public class ScnnerDemo3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("what amount of loan is needed? ");
		int loanAmount = input.nextInt();
		
		if(loanAmount <= 200000) {
			System.out.println("I will lent the money ");
		}else {
			System.out.println("I will reject then client");
		}
	    
     
	}

}
