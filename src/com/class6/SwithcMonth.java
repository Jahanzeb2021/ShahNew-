package com.class6;

import java.util.Scanner;

public class SwithcMonth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter 3 months");
		String month = scan.nextLine();

		switch (month) {
		case "january":
		case "feberuary":
		case "march":
			System.out.println("Summer");
			break;

		case "april":
		case "may":
		case "june":
			System.out.println("Winter");
			break;
		case "july":
		case "august":
		case "september":
			System.out.println("Spring");
		case "october":
		case "november":
		case "december":
			System.out.println("fall");
			break;
			
		default:
			System.out.println("Not a valid month is enered !!!");

		}

	}

}
