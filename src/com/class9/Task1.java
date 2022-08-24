package com.class9;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		String creditCard;
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Do you want apply for Card ?");
			creditCard = input.nextLine();

		} while (!creditCard.equalsIgnoreCase("yes"));
		{

			System.out.println("No more question");
		}

	}

}
