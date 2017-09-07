package pbd;

import java.util.Scanner;

public class PINLockout {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = input.nextInt();
		tries++;

		while (entry != pin && tries < 3) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = input.nextInt();
			tries++;
		}

		if (entry == pin)
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if (tries >= 3)
			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
	}

}
