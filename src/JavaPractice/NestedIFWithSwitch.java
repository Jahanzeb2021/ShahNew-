package JavaPractice;

import java.util.Scanner;

public class NestedIFWithSwitch {

	public static void main(String[] args) {
//Ask the user to enter any number
//if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
//If the number is even then check if it is greater than 1000 or not.
//If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter any Number ");
		int number = scan.nextInt();
		
		if(number%2==0) {
			System.out.println("Value is even = "+number);
			if(number > 1000) {
				System.out.println("Even value is large = "+number);
			}else {
				System.out.println("Even value is just right = "+number);
			}
		}else {
			System.out.println("Value is odd = "+number);
			if(number > 1000) {
				System.out.println("Odd value is large = "+number);
			}else {
				System.out.println("Odd value is just right = "+number);
			}
		}
	}

}
