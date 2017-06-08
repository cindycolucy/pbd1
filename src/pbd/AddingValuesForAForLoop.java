package pbd;

import java.util.Scanner;

public class AddingValuesForAForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer.");

		int max = input.nextInt();
		System.out.println("The numbers are:");
		int sum = 0;

		for (int i = 1; i <= max; i++) {
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("The sum is " + sum);
	}

}
