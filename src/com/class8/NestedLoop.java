package com.class8;

public class NestedLoop {

	public static void main(String[] args) {

		for (int o = 1; o <= 3; o++) {
			System.out.println("I am outter loop");
			for (int i = 1; i <= 4; i++) {
				System.out.println("I am inner loop");
			}
			System.out.println();
		}

	}

}
