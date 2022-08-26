package com.class10;

public class ArrayIntrotherWay {

	public static void main(String[] args) {
		// value will be stored based on the indexes in array 
   String []names = {"shah","moneer","azami","fardeen","mateen" };
   
    System.out.println(names[3]);
    
    int size =names.length;
    System.out.println("size of names array "+size);
    
    char[] array = new char [6];
    array[0]='A';
    array[1]='B';
    array[2]='C';
    array[3]='D';
    array[4]='E';
    array[5]='F';
    System.out.println(array[1]);
    System.out.println();
    char[]array1= {'A','B','C','D','E','F'};
    System.out.println(array1[1]);
    
    System.out.println("---------Another Way------------");
    
    String []word = new String [4];
    word [0]="Java";
    word [1]="Saturday";
    word [2]="day";
    word [3]="coding";
    
    System.out.println(word[1]+" is "+word[0]+" "+word[3]+" "+word[2]);
    
    System.out.println(names[names.length-2]);//fardeen
    int i = 2;
    System.out.println(names[2]);//azami
    
    i+=2;
    System.out.println(names[1]);//moneer
    
    for(int c = 0; c<names.length; c++) {
    	System.out.print(names[c]+" ");
    	
    }
    System.out.println("----------------");
    for(int c = 0; c<=names.length-1; c++) {
    	System.out.print(names[c]+" ");
    	
    }
    
	}

}
