package pbd;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a number 1-10.");
		
		int n = input.nextInt();
		
		Random r = new Random();

		int x = 1 + r.nextInt(10);
		
		if (n == x){
			System.out.println("Correct! You win!");
			
		}else{
			System.out.println("Sorry, the number I was think of is " + x + ".");
		}

	}

}
