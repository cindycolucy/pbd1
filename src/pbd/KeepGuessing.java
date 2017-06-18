package pbd;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number 1-10.");

		int n = input.nextInt();

		Random r = new Random();

		int x = 1 + r.nextInt(10);

		while (n != x) {
			System.out.println("Sorry, wrong number, guess again.");
			n = input.nextInt();

		}
		System.out.println("Correct! The number is " + x + ".");
	}

}
