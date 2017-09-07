package pbd;

import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF CINDY.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = input.nextInt();

		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = input.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}
