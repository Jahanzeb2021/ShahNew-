package com.class5;

import java.util.Scanner;

public class BirthMonthTask {

	public static void main(String[] args) {
		String birthMonth;
		String season;
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("Please enter your BirthMonth");
		birthMonth = input.next();

		if (birthMonth.equalsIgnoreCase("june") || birthMonth.equalsIgnoreCase("July")
				|| birthMonth.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("Feberuary")) {
			season = "Winter";
		} else if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {
			season = "Spring";
		} else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
			season = "Fall";
		} else {
			season = "Invalid !";
		}
		System.out.println("If your birthMonth is " + birthMonth + ", Your in " + season + " Season. ");
	}

}
