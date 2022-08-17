package com.class6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * if sale more >= 100 < 200 commision 10 % if sale more > 50 <100 commision 5 %
		 * if sale more > 200 =< 300 commision 20 % if sale more > 300 < 400 commision
		 * 30 % if sale more >= 500 < 1000 commision 50 %
		 */

		
		int sale;
		double commision ;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your sale ? ");
		sale = input.nextInt();
		

		if (sale >= 100 && sale < 200) {
			commision=(sale*10)/100;
		} else if (sale > 50 && sale < 100) {
			commision=(sale*5)/100;
		} else if (sale > 200 && sale <= 300) {
			commision=(sale*20)/100;
		} else if (sale > 300 && sale < 400) {
			commision = (sale * 30)/100;
		} else if (sale > 500  && sale <= 1000) {
			commision=(sale*50)/100;
		} else {
			commision = 0;
		}
		
		System.out.println("Your daily sale is = "+sale+" and commision = "+commision);

		
		if(sale >= 1000 ) {
			System.out.println("You are a geat seller ");
		}
		
		
	}

}
