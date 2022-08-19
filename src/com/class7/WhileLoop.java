package com.class7;

public class WhileLoop {

	public static void main(String[] args) {

		// while (time > 12) {
		// System.out.println("Good Day !");
		// }

		int time = 13;
		while (time > 12) {
			System.out.println("Good Day !");
			time--;
		}

		// I want to print number from 1 to 50

		int num1 = 1;

		while (num1 <= 50) {
			System.out.println(num1);
			num1++;
		}
		System.out.println();

		// I want to print numbers from 10 to 50

		int num = 10;

		while (num <= 60) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		System.out.println("------------------------");
		// i want to print numbers from 10 to 30 only numbers

		int a = 10;
		while (a <= 30) {
			System.out.print(a + " ");
			a += 2;
		}

		System.out.println();
		System.out.println("---------- Another Way --------------");
		System.out.println();

		int b = 10;

		while (b <= 40) {
			if (b % 2 == 0) {
				System.out.print(b + " ");
				//b++ here we get infinite loop
			}

			b++;
		}
		
		System.out.println("-------------------");
		System.out.println();

		//print numbers from 100 to 1 odd numbers only
		
		int c = 100;
		
		while (c >= 1) {
			if(c%2==1) {
			
				System.out.print(c+" ");
			}
			c--;
		}
		
		System.out.println();
		System.out.println("---------------Way Two----------");
		
		
		int d = 99;
		while (d >= 1) {
			
			System.out.print(d+" ");

			d-=2;
		}
		
		
	}

}
