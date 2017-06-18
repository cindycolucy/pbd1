package pbd;

import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your last name?");
		
		String name = input.nextLine();
		
		String compare = "z";
		
		int a = compare.compareTo(name);
		
		if (a > 3){
			System.out.println("You don't have long to wait.");
		}else if (a > 3 && a >= 10){
			System.out.println("That's not bad.");
		}else if (a > 10 && a >= 19){
			System.out.println("Look like a bit of a wait.");
		}else if (a > 19 && a >= 21){
			System.out.println("It's gonna be a while.");
		}else {
			System.out.println("Not going anywhere for a while.");
		}

	}

}
