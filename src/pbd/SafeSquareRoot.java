package pbd;

import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number.");

		int n = input.nextInt();
		
		while (n < 0) {
			System.out.println("You can't take the square root of a negative number. Try again.");
			n = input.nextInt();
		}
			if (n >=1){
				System.out.println("The square root of " + n + " is " + Math.sqrt(n));
			}

		}
	
		

	}
