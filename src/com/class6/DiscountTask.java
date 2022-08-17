package com.class6;

import java.util.Scanner;

public class DiscountTask {

 public static void main (String [] shah) {
	 
	boolean sale;
	int price ;
	double discount = 0 ;
	double finalPrice;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Is there any sale ?");
	sale = input.nextBoolean();
	
	if(!sale) {
		System.out.println("we go for shopping");
		System.out.println("How much is the price ?");
		price = input.nextInt();
		if(price > 50 ) {
			discount = price*10/100;		
		}else if(price >= 50 && price <= 100) {
			discount = price*20/100;
		}else if(price > 500) {
			discount = price*50/100;
		}
		
		finalPrice = price-discount;
		System.out.println("Item price is is = "+price+" and discount is = "+discount+" Your fianlPrice is = "+finalPrice);
	}else {
		System.out.println("No shopping for Today ");
	}
	
	
		
 }
}
