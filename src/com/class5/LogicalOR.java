package com.class5;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		String day = "monday";
		
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("tuesday")) {
			System.out.println("Today I hava a java class");
		}
		System.out.println("--------End of the code ------------------");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter todays using number only");
		int today = scan.nextInt();
		
		if(today==1 || today== 5  ) {
			System.out.println("I am off from syntax");
		}else if(today == 6 || today == 10 ) {
			System.out.println("I hava coding class ");
				
			}else if(today > 60 || today < 70 ) {
				System.out.println(" I am going to sleep because no class today ");
		}
		

	}

}
