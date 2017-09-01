package pbd;

import java.util.Scanner;

public class TwentyQuestions {

	public static void main(String[] args) {
		System.out.println("Think of an object and I'll try to guess it.");

		Scanner input = new Scanner(System.in);

		System.out.println("Animal, vegetable or mineral?");
		String answer1 = input.nextLine();

		System.out.println("Is it bigger than a breadbox?");
		String answer2 = input.nextLine();

		if ((answer1.equalsIgnoreCase("Animal")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a moose!");
		}
		if ((answer1.equalsIgnoreCase("Animal")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a squirrel!");

		}
		if ((answer1.equalsIgnoreCase("Vegetable")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a watermelon!");

		}
		if ((answer1.equalsIgnoreCase("Vegetable")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a carrot!");
		}
		if ((answer1.equalsIgnoreCase("Mineral")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a Camero!");
		}
		if ((answer1.equalsIgnoreCase("Mineral")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a paper clip!");

		}
	}
}
