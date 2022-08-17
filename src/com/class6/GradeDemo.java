package com.class6;

import java.util.Scanner;

public class GradeDemo {

	

	public static void main(String[] args) {
		
    Scanner scan;
    char grade;
    String explanation;
    scan = new Scanner (System.in);
    System.out.println("Please enter your grade");
    grade = scan.next().charAt(0);
    
    switch(grade) {
    case 'A':
    	explanation ="Excelent";
    	break;
    case 'B':
    	explanation ="Great";
    	break;
    case 'C':
    	explanation = "veryGood";
    	break;
    case 'D':
    	explanation = "Good";
    	break;
      case 'E':
    	explanation ="Ok ";
    	break;
    default:
    	explanation ="Fail need to Study hard";
    	
    }
    
    System.out.println("You grade is = "+grade+", you did "+explanation+" in the quiz.");
   
    

	}

}
