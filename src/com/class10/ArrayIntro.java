package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] grades = new int [5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		 int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		 System.out.println("Averagescore of my students = "+average);
		 
		 int a = 10;
		 int b;
		 b=10;
		 
		 double[]array;
		 array= new double[3];
		 array[0]=12.99;
		 array[1]=10.99;
		 
		 System.out.println("Value of last element "+array[2]);
		 array[2]=5.99;
		 System.out.println("Value of last element "+array[2]);
		 
		 //array[3]=7;
		 //System.out.println(array[3]);
		 //java.lang.ArrayIndexOutOfBoundsException: 3
		 
		
		

	}

}
