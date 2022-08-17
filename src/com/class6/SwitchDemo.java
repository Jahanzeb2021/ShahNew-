package com.class6;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner scan;
		String country;
		String PrintLanaguage;

		scan = new Scanner(System.in);
		System.out.println("Please Enter Your Country ? ");
		country = scan.nextLine();

		switch (country) {
		
		case "Afghan":
			PrintLanaguage = "Dari";
			break;
		case "USA":
			PrintLanaguage = " English";
			break;
		case "China":
			PrintLanaguage = "Chinese";
			break;
		case "India":
			PrintLanaguage = "Urdu";
			break;
		case "Germany":
			PrintLanaguage = "Dustch";
			break;
			
          default:
        	  PrintLanaguage ="Invalid Country is entered";
          
		}
		
		System.out.println("The Country your enterd is "+country+" based on your country you speak, "+PrintLanaguage);
		

	}

}
