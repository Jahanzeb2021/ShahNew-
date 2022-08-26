package JavaPractice;

public class arrayOFAnimals {

	public static void main(String[] args) {
		
       String [] animal = {"Dog ","Donkey "," Monkey "," Elephant "," Goat "," Cow " };
       
       //System.out.println(animal.length);
       for (int i = 0; i < animal.length; i++) {
    	   System.out.print(animal[i]+"");
    	   
       }
       System.out.println();
       System.out.println("--------------");
       
       for(String ani:animal) {
    	   
    	   System.out.print(ani+"");
    	   
       }
       System.out.println();

	}

}
