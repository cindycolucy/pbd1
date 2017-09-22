package pbd;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {

		int a = 3;
		int b = 3;
		int c = 3;
		int atotal = 0;
		int btotal = 0;
		int ctotal = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Select a pile A, B or C.");

		String pile = input.nextLine();

		System.out.println("How many to remove from pile " + pile + "?");

		int num = input.nextInt();

		while (atotal > 0 || btotal > 0 || ctotal > 0) {
			if (pile == "A") {
				atotal = a - num;
				btotal = b;
				ctotal = c;
				System.out.println("A: " + atotal + ", B: " + btotal + ", C: " + ctotal);
			} else if (pile == "B") {
				atotal = a;
				btotal = b - num;
				ctotal = c;
				System.out.println("A: " + atotal + ", B: " + btotal + ", C: " + ctotal);
			} else {
				atotal = a;
				btotal = b;
				ctotal = c - num;
				System.out.println("A: " + atotal + ", B: " + btotal + ", C: " + ctotal);
			}

		}

	}
}
