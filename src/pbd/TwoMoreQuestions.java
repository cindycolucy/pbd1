package pbd;

import java.util.Scanner;

public class TwoMoreQuestions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Does it belong inside or outside or both?");
		String answer1 = input.nextLine();

		System.out.println("Is it alive?");
		String answer2 = input.nextLine();

		if ((answer1.equalsIgnoreCase("Inside")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a houseplant!");
		}
		if ((answer1.equalsIgnoreCase("Inside")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a shower curtain!");
		}
		if ((answer1.equalsIgnoreCase("Outside")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a bison!");
		}
		if ((answer1.equalsIgnoreCase("Outside")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a billboard!");
		}
		if ((answer1.equalsIgnoreCase("Both")) && (answer2.equalsIgnoreCase("Yes"))) {
			System.out.println("It's a dog!");
		}
		if ((answer1.equalsIgnoreCase("Both")) && (answer2.equalsIgnoreCase("No"))) {
			System.out.println("It's a cell phone!");
		}
	}
}
