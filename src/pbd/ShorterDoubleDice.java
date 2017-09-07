package pbd;

import java.util.Random;

public class ShorterDoubleDice {

	public static void main(String[] args) {
		Random r = new Random();

		int num1 = 1 + r.nextInt(6);
		int num2 = 1 + r.nextInt(6);

		System.out.println("Rolling the dice...");

		do {
			System.out.println("The first number is " + num1);
			num1 = 1 + r.nextInt(6);
			System.out.println("The second number is " + num2);
			num2 = 1 + r.nextInt(6);

		} while (num1 != num2);
	}

}
