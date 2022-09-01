package JavaPractice;

import java.util.Scanner;

public class Repls38 {

	public static void main(String[] args) {

		// Prompt user with a question: "Is it weekend?"
		// If it is not a weekend --> subject="manual testing"
		// Otherwise --> subject="Java"

		String subject;
		Scanner input = new Scanner(System.in);
		System.out.println("Is it weekend ?");
		boolean weekend = input.nextBoolean();

		if (!weekend) {
			subject = "manuel testing";
		} else {
			subject = "JaVa";
		}
     System.out.print(subject+" ");
     
	}

}
