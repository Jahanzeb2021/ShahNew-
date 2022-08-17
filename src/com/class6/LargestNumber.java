package com.class6;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	
		int num1, num2 ,num3;
	    Scanner input= new Scanner (System.in);
	    System.out.println("Please Enter 3 Numbers to find the largest Number");

	    num1 =input.nextInt();
	    num2 =input.nextInt();
	    num3 =input.nextInt();
	    
	   if(num1 > num2 && num1 > num3 ) {
		   System.out.println("Num1 is largest number "+num1);   
	   }else if(num1 < num2 && num2 > num3 ) {
		   System.out.println("Num2 is largest number "+num2);
	   }else {
		   System.out.println("Num3 is lagest number "+num3);
	   }
	   
	   System.out.println("-----------------------------------");
	   
	   if(num1 == num2 && num2 == num3 ) {
		   System.out.println("numbers are not equal");
	   }else {
		   System.out.println("number numbers are equal ");
	   }
	}

}
