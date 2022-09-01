package com.class12;

public class Swap2Numbwe {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		System.out.println("Before swap a value = "+a);
		System.out.println("Before swap b value = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println("Afer Swap b value = "+b);
		System.out.println("After Swap a value = "+a);
		
		System.out.println("-------------------------");
		System.out.println();
		
		int x=100,y=200;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		
		y = x+y;
		x = y-x;
		y= y-x;
		System.out.println("X and Y after Addition = "+y);
		System.out.println("x = "+x);
		System.out.println("Y = "+y);
		
		
		
		

	}

}
