package JavaPractice;

import java.util.Scanner;

public class Repls35 {

	public static void main(String[] args) {
//Create a program that prompt user with question:  "Do you need a loan?"
//If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
//Based on the score define users eligibility:
//if score is below  600 --> eligibility = "Not eligible"
//if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

		boolean loan;
		int CreditScore;
		String eligibility;
		Scanner input = new Scanner(System.in);
		System.out.println("Do you need a loan ?");
		loan = input.nextBoolean();
		if (loan) {
			System.out.println("What is your Credit Score ?");
			CreditScore = input.nextInt();
			if (CreditScore < 600) {
				eligibility = "Not eligible";
			} else if (CreditScore >= 600 && CreditScore < 700) {
				eligibility = "Maybe eligible";
			} else if (CreditScore >= 700 && CreditScore < 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}

		} else {
			eligibility = " User does not need a loan";
		}

		System.out.println("User become eligible based on the credit score = " + eligibility);

	}

}
