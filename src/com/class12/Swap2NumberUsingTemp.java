package com.class12;

public class Swap2NumberUsingTemp {

	public static void main(String[] args) {
		// Swap two number using temp variable 
		
		int n1 = 10; 
		int n2 = 20;
		int temp;
		
		temp =n1+n2;
		System.out.println("Value of temp after Addition of 2 Num ="+temp);
		n2=temp-n2;
		System.out.println("Value of n2 after swap = "+n2);
		n1=temp-n1;
		System.out.println("Value of n1 after swap = "+n1);

	}

}
