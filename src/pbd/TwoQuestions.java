package pbd;

import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Animal, vegetable or mineral");
		String answer1 = input.nextLine();

		System.out.println("Is it bigger than a bread box? Yes or no?");
		String answer2 = input.nextLine();

		if (answer1.equalsIgnoreCase("Animal") && answer2.equalsIgnoreCase("Yes")) {
			System.out.println("It is a moose.");
		}

		else if (answer1.equalsIgnoreCase("Animal") && answer2.equalsIgnoreCase("No")) {
			System.out.println("It is a squirrel.");
		}

		else if (answer1.equalsIgnoreCase("Vegetable") && answer2.equalsIgnoreCase("Yes")) {
			System.out.println("It is a watermelon.");
		}

		else if (answer1.equalsIgnoreCase("Vegetable") && answer2.equalsIgnoreCase("No")) {
			System.out.println("It is a carrot.");
		}

		else if (answer1.equalsIgnoreCase("Mineral") && answer2.equalsIgnoreCase("Yes")) {
			System.out.println("It is a Camero.");
		}

		else if (answer1.equalsIgnoreCase("Mineral") && answer2.equalsIgnoreCase("No")) {
			System.out.println("It is a paper clip.");
		}

	}

}
