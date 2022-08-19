package com.class7;

import java.util.Scanner;

public class SwitchWithArrtimatic {

	public static void main(String[] args) {

		Scanner input;
		int num1;
		int num2;
		char Operator = 0;
		int result = 0;

		input = new Scanner(System.in);
		System.out.println("Please enter Num1");
		num1 = input.nextInt();
		System.out.println("Please enter Operator");
		Operator = input.next().charAt(0);
		System.out.println("Plese enter Num2");
		num2 = input.nextInt();
		

		switch (Operator) {
		case '+':
			result=num1+num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
			result='0';

		}

		System.out.println(
				"Input Num1 " + num1 + ", Operator " + Operator + ", Input num2 " + num2 + ", Result = " + result);
	}

}
