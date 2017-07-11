package pbd;

import java.util.Scanner;

public class AddingValuesLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int a = input.nextInt();
		
		while (a != 0) {
			System.out.println("Enter another number.");
			int b = input.nextInt();
			int c = (a + b);
			System.out.println("The total so far is " + c);
			System.out.println("Enter another number.");
			a = input.nextInt();
			int d = (a + c);
			System.out.println("The total so far is " + d);
			System.out.println("Enter another number.");
			a = input.nextInt();
			int e = (a + d);
			System.out.println("The total is " + e);
		}

	}

}
