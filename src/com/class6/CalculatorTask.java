package com.class6;

import java.util.Scanner;

public class CalculatorTask {
	public static void main (String [] shah) {
		
	
		Scanner input;
		int num1, num2;
		char operator;
		int result = 0;
		
	   input= new Scanner (System.in);
	  System.out.println("Please enter num1 ");
	  num1 = input.nextInt();
	  System.out.println("Please enter num2");
	  num2 = input.nextInt();
	  System.out.println("Plase enter Oprator");
	  operator = input.next().charAt(0);
	  
	 if(operator == '+') {
		 result = num1+num2;	 
	 }else if(operator == '*') {
		 result = num1*num2;
	 }else if(operator == '-') {
		 result = num1-num2;			 
	 }else if(operator =='/') {
		 result = num1/num2;
	 }
	 System.out.println("num1 is "+num1+", and operator is "+operator+", num2 is "+num2+", result = "+result);
	 
	 }
	   
	}

