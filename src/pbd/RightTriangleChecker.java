package pbd;

import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		while (num1 > num2) {
			System.out.println(num2 + " is smaller than " + num1 + ". Try again.");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
		}
		
		while (num2 > num3) {
				System.out.println(num3 + " is smaller than " + num2 + ". Try again.");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt(); 
		}
		if ((num2 * num2) + (num3 * num3) == (num1 * num1)) {
			System.out.println("Your numbers are " + num1 + ", " + num2 + ", " + num3);
			System.out.println("That is a right triangle.");
		} else {
			System.out.println("Your numbers are " + num1 + ", " + num2 + ", " + num3);
			System.out.println("That is not a right triangle.");

		}
	}
}
