package pbd;

import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {

		Random r = new Random();

		int num1 = 1 + r.nextInt(54);
		int num2 = 1 + r.nextInt(54);
		int num3 = 1 + r.nextInt(54);
		int num4 = 1 + r.nextInt(54);
		int num5 = 1 + r.nextInt(54);
		int num6 = 1 + r.nextInt(54);

		int choice = 1 + r.nextInt(6);
		String response = "";

		if (choice == 1)
			response = "You need to change careers";
		else if (choice == 2)
			response = "Seek out change";
		else if (choice == 3)
			response = "You will come into some money";
		else if (choice == 4)
			response = "Play the lottery";
		else if (choice == 5)
			response = "Change is in the future for you";
		else if (choice == 6)
			response = "Stick with your wife";
		else
			response = "ERROR!";

		System.out.println("Your fortune is: " + response);

		System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
	}
}
