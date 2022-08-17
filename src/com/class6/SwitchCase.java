package com.class6;

public class SwitchCase {

	public static void main(String[] args) {

		int month = 7;
		String print;

		switch (month) {
		case 1:
			print = "January";
			break;
		case 2:
			print = "February";
			break;
		case 3:
			print = "March";
			break;
		case 4:
			print = "April";
			break;
		case 5:
			print = "May";
		break;	
		default:
			print = " Invalid Month";
		}

		System.out.println("Month is = " + print);

	}

}
