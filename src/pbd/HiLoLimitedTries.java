package pbd;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimitedTries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number 1-100. You have seven tries. Guess #1:");

		int n = input.nextInt();

		Random r = new Random();

		int x = 1 + r.nextInt(100);

		int g = 1;

		while (n != x && g <= 6) {
			if (n > x) {
				System.out.println("Too high, guess again.");

			} else if (n < x) {
				System.out.println("Too low, guess again.");
			}
			g++;
			System.out.println("Guess #" + g);
			n = input.nextInt();

		}
		if (n != x) {
			System.out.println("Seven tries, you lose. The number was " + x);
		}
		if (n == x) {
			System.out.println("Correct! The number was " + x);
		}
	}
}