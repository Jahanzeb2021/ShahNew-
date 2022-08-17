package com.class3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CompoundOpertors {
	public static void main(String[] args) {
		
		int num= 100;
		num=num+10;
		System.out.println(num);
		
		num=num+200;
		System.out.println(num);
		
		System.out.println();
		
		int myNum =100;
		myNum+=10;
		System.out.println(myNum);
		
		myNum+=200;
		System.out.println(myNum);
		
		
		myNum-=110;
		System.out.println(myNum);
		
	    myNum/=10;
	    System.out.println(myNum);
	    
	    myNum*=21;
	    System.out.println(myNum);
	   
	   System.out.println("Assigment ------");
	   
	   double a,b;
	   a=13.99;
	   b=.4;
	   
	   double result= a/5;
	   System.out.println(result);
	   
	   result= a%b;
	   System.out.println(result);
	   
	   
		
		
	}

}
