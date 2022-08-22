package com.class8;

import java.util.Scanner;

public class RecapWhile {
	public static void main(String[] args) {
		/*
		 * ask user to pay for a water
		 * water price is 5
		 * once user enters money then we need to tell if we need more money or less
		 * once user gives us exact 5 then ----> enjoy your water!
		 */
		int money ;
		int waterPrice =5;
		Scanner input = new Scanner (System.in);
		System.out.println("Please pay for Water");
		money =input.nextInt();
		
		while(money != waterPrice) {
			if(money > waterPrice) {
				System.out.println("Please pay less money ");
			}else {
				System.out.println("Please pay more money");
			}
				
			money =input.nextInt();
		}
			
		
		System.out.println("Please enjoy the water");
		
		
		        
      
		
		
	}

}
