package com.class4;

import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void main (String [] shah ) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter boolean value for rain");
		boolean rain = scan.nextBoolean();
		
		if(rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It is a nice weather got for a waik");
		}
		
		System.out.println("------------- lets capture a integer value");
		
		System.out.println("please enter your name");
		String name =scan.next();
		
		System.out.println("Please enter your age");
	    int age = scan.nextInt();
	    
	    System.out.println("your name is "+name+" your "+age+" years old ");
	}

}
