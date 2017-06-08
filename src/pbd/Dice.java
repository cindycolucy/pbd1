package pbd;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();

		int num1 = 1 + r.nextInt(6);
		int num2 = 1 + r.nextInt(6);
		
		System.out.println("Rolling the dice...");
		System.out.println("The first number is " + num1);
		System.out.println("The second number is " + num2);
		System.out.println("The total is " + (num1 + num2));

	}

}
