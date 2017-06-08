package pbd;

import java.util.Scanner;

public class AgeMessages3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age.");

		int age = input.nextInt();

		if (age < 16) {
			System.out.println("You can't drive.");

		} else if (age == 16 || age == 17) {
			System.out.println("You can drive but you can't vote.");

		} else if (age >= 18 && age <= 24) {
			System.out.println("You can vote but not rent a car.");
		} else if (age >= 25) {
			System.out.println("You can do pretty much anything.");
		}
	}

}
