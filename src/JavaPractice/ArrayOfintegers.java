package JavaPractice;

public class ArrayOfintegers {

	public static void main(String[] args) {
		
    int [] array = new int [5];
    int sum = 0;
    array[0]= 20;
    array[1]= 30;
    array[2]= 40;
    array[3]= 10;
    array[4]= 50;
    
    for(int arr:array) {
    	sum+=arr;
    	System.out.println(sum+" ");
    }
    
    int sum2 = 0;
    System.out.println("----------------------");
    for (int c = 0; c < array.length; c++) {
    	
    	
    	System.out.println(array[c]);
    	
    }
    
    
	}

}
