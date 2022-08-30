package JavaPractice;

import java.util.Scanner;

import javax.swing.Spring;

public class Repls36 {
public static void main(String[] args) {
        
	    String output;
		String word1, word2;
		int int1, int2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two String ");
		word1 = scan.nextLine();
		word2 = scan.nextLine();
		System.out.println("Please enter two Integer ");
		int1 = scan.nextInt();
		int2 = scan.nextInt();
		
		if (int1 == int2 && word1 == word2) {
			output = "AND";

		} else if (int1 != int2 || word1 == word2) {
			output = "OR";

		} else if (int1 != int2 && word1 != word2) {
			output = "None";

		}

		//System.out.println("print "+output);

	}

}
