package JavaPractice;

public class ArrayOFCars2D {

	public static void main(String[] args) {
		 
		String [][] cars = {
				{"Ford","Dodge","Chovelet","Jeeb"},
				{"Bmw","Bend","Audo","Wolkswagon","Volvo"},
				{"Ferarri","Lamborghani","Mesarati"},
				{"Kia","Hundai","Hammer"},
		};
		
		System.out.println(cars.length);
		
		for (int row = 0; row <cars.length; row++) {
			for(int col = 0; col < cars[row].length; col++) {
				
				System.out.print(cars[row][col]+" ");
			}
			
			System.out.println();
			
			System.out.println("----------------for each loop----------------");
			System.out.println();
			for (String []car:cars) {
				
				for (String ca :car) {
					System.out.print(ca+" ");
				}
				
				System.out.println();
			}
		}
 
	}

}
