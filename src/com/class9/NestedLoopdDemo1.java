package com.class9;

public class NestedLoopdDemo1 {
	public static void main(String[] args) {
		
		for(int i = 11; i <= 99; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		for (int i = 1; i <= 9; i ++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i+""+j);
			}
		}
		
	}

}
