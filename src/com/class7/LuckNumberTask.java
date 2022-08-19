package com.class7;

import java.util.Scanner;

public class LuckNumberTask {

	public static void main(String[] args) {
		
	 int  NumFromCustomer;
	 int LuckyNum= 10;
     Scanner input = new Scanner (System.in);
     System.out.println("Please enter any Number until Number match lucky number ");
     NumFromCustomer = input.nextInt();
     
     while(NumFromCustomer!=LuckyNum) {
    	 System.out.println("Please enter any Number until Number match lucky number ");
         NumFromCustomer = input.nextInt();
     }
     
     System.out.println("U guess it Right !!");
     

	}

}
