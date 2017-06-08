package pbd;

import java.util.Scanner;

public class ChooseAdventure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("You enter a creepy house. Would you like to go into the <kitchen> or go <upstairs>?");
		
		String a = input.nextLine();
		
		if (a.equalsIgnoreCase("Kitchen")){
			System.out.println("There is a pile of dirty dishes. Do you want to do the <dishes> or sit at the <table>?");
			}
		String b = input.nextLine();
		
		if (b.equalsIgnoreCase("Dishes")){

		if (a.equalsIgnoreCase("Upstairs")){
			
			
				
			}
			
		}

	}

}
