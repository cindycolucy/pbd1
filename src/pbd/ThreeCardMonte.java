package pbd;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Guess which cup 1-3.");

		int c = input.nextInt();

		Random r = new Random();

		int x = 1 + r.nextInt(3);

		if (c == x) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");

		}
		System.out.println("The cup was " + x);

	}

}
