package com.class5;

import java.util.Scanner;

public class ConvertFeranhietINtoCelsius {

	public static void main(String[] args) {
		
		
		double tempInFeranhiet;
		String City;
		Scanner input;
		
		input = new Scanner(System.in);
		System.out.println("Please enter your City");
		City =input.next();
		System.out.println("Please enter Temprature in your City");
		tempInFeranhiet = input.nextDouble();
	    
	    tempInFeranhiet =((tempInFeranhiet -32)*5)/9;
	    
	    System.out.println("Your City is "+City+ " Temprature in Celsius "+tempInFeranhiet);

	}

}
