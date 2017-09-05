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
		
		if(age < 20) {
			System.out.println("I shall call you " + firstName + lastName);
		}

	}
}
