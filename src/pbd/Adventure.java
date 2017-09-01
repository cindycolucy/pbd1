package pbd;

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {

		System.out.println("You enter a creepy house. Do you choose to go <upstairs> or <downstairs>?");

		Scanner input = new Scanner(System.in);

		String r2 = input.nextLine();

		if ((r2.equalsIgnoreCase("Upstairs"))) {
			System.out.println("Do you enter the <bedroom> or the <bathroom>?");
			String r4 = input.nextLine();
			if ((r4.equalsIgnoreCase("Bedroom"))) {
				System.out.println("In the bedroom do you open the <closet> or lie down on the <bed>?");
				String r8 = input.nextLine();
				if ((r8.equalsIgnoreCase("Closet"))) {
					System.out.println("In the closet is a scary ghost. Game over!");
				} else {
					System.out.println("Have a nice nap! You win!");
				}
			} else {
				System.out.println("In the bathroom do you close the window? <Yes> or <no>?");
				String r5 = input.nextLine();
				if ((r5.equalsIgnoreCase("Yes"))) {
					System.out.println("Thank you! You win the game!");
				} else {
					System.out.println("You are suddenly compelled to jump out the window. Game over!");
				}
			}

		}

		if ((r2.equalsIgnoreCase("Downstairs"))) {
			System.out.println("Do you enter the <kitchen> or the <living room>?");
			String r6 = input.nextLine();
			if ((r6.equalsIgnoreCase("Kitchen"))) {
				System.out.println("In the kitchen do you do the <dishes> or open the <fridge>?");
				String r12 = input.nextLine();
				if ((r12.equalsIgnoreCase("Dishes"))) {
					System.out.println("Thank you! You win the game!");
				} else {
					System.out.println("There's a zombie in the fridge! Game over!");
				}
			} else {
				System.out.println("In the living room do you turn on the <tv> or eat the <candy>?");
				String r14 = input.nextLine();
				if ((r14.equalsIgnoreCase("Tv"))) {
					System.out.println("Enjoy the show! You win the game!");
				} else {
					System.out.println("You die of food poisoning! Game over!");
				}
			}

		}
	}
}
