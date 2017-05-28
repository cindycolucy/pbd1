
public class Math {

	public static void main(String[] args) {
		{
			//Print
			System.out.println("I will now count my chickens:");

			//Hens math
			float hens = ((25 + 30) / 6f);
			System.out.println("Hens " + hens);
			
			//Roosters math
			float roosters = ((100 - 25) * (3 / 4f));
			System.out.println("Roosters " + roosters);

			//Print
			System.out.println("Now I will count the eggs:");

			//Eggs math
			float eggs = (3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6f);
			System.out.println (eggs);

			//Math
			System.out.println("Is it true that 3 + 2 < 5 - 7?");
			boolean wonder = (3 + 2 < 5 - 7);

			//More math
			System.out.println(3 + 2 < 5 - 7);
			
			//Even more math
			System.out.println("What is 3 + 2? " + (3 + 2));
			
			//Math negative number
			System.out.println("What is 5 - 7? " + (5 - 7));

			//Comment
			System.out.println("Oh, that's why it's false.");

			//Another comment
			System.out.println("How about some more.");

			//Math
			System.out.println("Is it greater? " + (5 > -2));
			
			//Even more math
			System.out.println("Is it greater or equal? " + (5 >= -2));
			
			//Final math
			System.out.println("Is it less or equal? " + (5 <= -2));
		}
	}

}
