package com.class6;

import java.util.Scanner;

public class SaleDemo1 {

	public static void main(String[] args) {

	    
	    String sale1;
		Scanner input = new Scanner(System.in);
	    System.out.println("Does the store has sale ?");
	    sale1 = input.nextLine();
		
	    if(sale1.equalsIgnoreCase("Yes")) {
	    	System.out.println("We are  going to shopping");
	    }else {
	    	System.out.println("we are not going to shopping");
	    }


	}

}
