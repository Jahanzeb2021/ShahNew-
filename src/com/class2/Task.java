package com.class2;

public class Task {

	public static void main(String[] args) {
		
       float num1 = 20.99f;
       float num2 = 30.99f;
       
        
       float addition = num1+num2;
       System.out.println(addition);
       float multiplication = num1*num2;
       System.out.println(multiplication);
       float division = num1/num2;
       System.out.println(division);
       float minus = num1-num2;
       System.out.println(minus);
       float module = num1%num2;
       System.out.println(module);
       
       /*
        * The square of 3.9 is ???
        * way one !!
        */
       
       float square = 3.9f;
       
        square= square*square;
        
        System.out.println("The square of 3.9 is = "+ square);
        
       // way two !!!
        
        int squareOfWholeNum = 19;
        System.out.println();
        System.out.println("The square of 19 is = "+(squareOfWholeNum*squareOfWholeNum));
        
        // how to find the area and premiter of a rectingle ?
        
        int width = 5;
        int hieght = 8;
        
        int perimeter = 2*(width+hieght);
        int area = width*hieght;
        
        System.out.println("the premiter of a rectangle with width 5 and hight 8 is ="
        + " "+perimeter+" and the area is "+area);
        
        System.out.println();
        
        String str = "hello";
        String str1 = "Boys !";
        
        System.out.println(str+" "+str1);
        
        
        
        
        
        
        
        
       
       
		

	}

}
