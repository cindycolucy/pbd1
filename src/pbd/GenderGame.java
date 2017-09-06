package pbd;

import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your gender? (M or F)");
		String gender = input.nextLine();

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Enter your age.");
		int age = input.nextInt();

		if (gender == "F" && age < 20) {
			System.out.println("I shall call you " + firstName + " " + lastName);
		}
		if (gender == "F" && age >= 20) {
			System.out.println("Are you married? (Y or N)");
			String married = input.nextLine();
			if (married == "Y") {
				System.out.println("I shall call you Mrs. " + lastName);
			}
		}
	}

}
