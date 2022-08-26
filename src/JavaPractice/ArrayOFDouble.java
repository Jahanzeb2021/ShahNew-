package JavaPractice;

public class ArrayOFDouble {

	public static void main(String[] args) {
		
	   double sum=0;
       double [] doo = {10.99,30.89,20.2,60.6,70.70};
       
        //System.out.println(doo.length);
       
       for (double door:doo) {
    	 
    	   sum+=door;
    	   System.out.println(sum);
    	   
    	   
       }
       
       System.out.println();
       System.out.println("--------------");
       
       double sum1 =0;
       double [] D = {10.55,8.99,99.9,77.8};
       
       for (int c = 0; c < D.length; c++) {
    	   
    	  sum1+=D[c];
    	  
    	   System.out.println(sum1);
    	   
       }
      
       

	}

}
