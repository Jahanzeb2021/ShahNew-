package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		int num= 1;
		String name;
		Scanner scan = new Scanner (System.in);
		
		while(num<=5 ) {
			System.out.println("Please tell me your name");
			name= scan.next();
			System.out.println("Nice to meet you !"+name);
			System.out.println("----------------------");
		 num++;
		}
		
		
		
	}

}
