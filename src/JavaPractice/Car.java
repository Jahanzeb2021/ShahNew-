package JavaPractice;

public class Car {

	public static void main(String[] args) {

		String[] cars = { "Bmw ", "Audi ", " Porsche ", " Lamborghani ", " Ferrari ", " Lecus" };

		for (int i = 0; i < cars.length; i++) {

			System.out.print(cars[i] + "");
		}

		System.out.println();
		System.out.println("------------------------");

		for (String car : cars) {

			System.out.print(car);
		}

	}

}
