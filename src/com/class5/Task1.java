package com.class5;

import java.util.Scanner;

public class Task1 {
 public static void main (String [] shah ) {
	 
	 
	 Scanner scan = new Scanner (System.in);
	 System.out.println("Please enter any day ");
	 int day = scan.nextInt();
	 
	 if(day >= 1 && day <= 5 ) {
		 System.out.println("It is weeday ");
	 }else if(day > 6 && day <= 8 ) {
		 System.out.println("It is Weekend");
	 }else {
		 System.out.println("Invalid day ");
	 }
 }
}
