package pbd;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number.");
		int n = input.nextInt();

		while (n % 2 == 0) {
			System.out.println(n / 2);
			
		}
	
		while (n % 2 != 0) {
			System.out.println(3 * n + 1);
			
		}

	}

}
