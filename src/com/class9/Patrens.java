package com.class9;

public class Patrens {

	public static void main(String[] args) {
		for(int a = 0; a < 6; a++ ) {
			for(int b = 0; b <12; b++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int c = 1; c <= 4; c++ ) {
			for(int d = 1; d <=5; d++) {
				System.out.print(d);
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(int r = 1; r <= 7; r++ ) {
			for(int c = 1; c<=8; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(int r = 7; r >=1; r--) {
			for(int c = 1; c<= 6; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(int r = 1; r <= 5; r++ ) {
			for(int c = 7; c>=1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		
	}

}
