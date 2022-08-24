package com.class8;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int mult;
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		num = scan.nextInt();
		

		for (int i = 1; i <= 10; i++) {

			mult = num * i;

			System.out.println(num + " X " + i + " = " + mult);
		}
		System.out.println();
		System.out.println("--------------Practice-------------------");

	}

}
