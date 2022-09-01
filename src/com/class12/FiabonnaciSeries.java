package com.class12;

public class FiabonnaciSeries {

	public static void main(String[] args) {
		// write a program to print the 1 first 10 fibonacci
		
		int n1 = 0, n2 = 1, sum;
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(n1+" ");
			  sum= n1+n2;
			  n1=n2;
			  n2=sum;
			  
		}

	}

}
