import java.util.Scanner;

public class FiveYears {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println ("What is your name?");
		String name = input.next();
		System.out.println (name);
		
		System.out.println ("What is your age?");
		int age = input.nextInt ();
		System.out.println (age);
		
		int ageInFive = (age + 5);
		System.out.println ("Your age in five years will be " + ageInFive);
		
		int ageFiveAgo = (age - 5);
		
		if (ageFiveAgo < 0){
			System.out.println ("You weren't even born yet!");
			}
		else {
		System.out.println ("Five years ago you were " + ageFiveAgo);
	}	
				

	}

}
