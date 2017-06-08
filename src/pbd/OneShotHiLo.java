package pbd;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number 1-100.");

		int n = input.nextInt();

		Random r = new Random();

		int x = 1 + r.nextInt(100);

		if (n > x) {
			System.out.println("Too high!");
		} else if (n < x) {
			System.out.println("Too low!");
		} else {
			System.out.println("You are correct!");

		}
		System.out.println("The number was " + x);

	}

}
