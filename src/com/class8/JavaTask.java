package com.class8;

public class JavaTask {

	public static void main(String[] args) {

		int result = 1;

		for (int i = 10; i >= 1; i -= 2) {

			result *= i;

			System.out.println(result + " ");
		}
		// System.out.println(result + " ");

		System.out.println();

		System.out.println("------------calculate sum of even or odd numbers from range 1 to 50 -------------");

		System.out.println();

		int sum = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {

				sum += i;
				// System.out.println("Print sum of even number "+sum);

			}

		}
		System.out.println("Print sum of even number " + sum);

		System.out.println();
		System.out.println("----------ODD-----------------");

		int sum1 = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {

				sum1 += i;
				// System.out.println("Print sum of even number "+sum);

			}

		}
		System.out.println("Print sum of odd number " + sum1);

	}

}
