package pbd;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 0;

		System.out.println("Enter a number.");
		int n = input.nextInt();

		while (n != 1) {
			if (n % 2 == 0) {
				System.out.println(n / 2 + " ");
				counter++;

			} else {
				System.out.println(3 * n + 1 + " ");
				counter++;
			}
			break;
		}
	}
}
