import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println ("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println ("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println ("What is your grade 1-12?");
		int grade = input.nextInt();
		
		System.out.println ("What is your five digit student ID?");
		long id = input.nextLong();
		
		System.out.println ("What is your login?");
		String login = input.next();
		
		System.out.println ("What is your GPA?");
		double gpa = input.nextDouble();
		
		System.out.println ("Your information:");
		System.out.println ("Name: " + firstName + " " + lastName);
		System.out.println ("Grade: " + grade);
		System.out.println ("Student ID:" + id);
		System.out.println ("Login: " + login);
		System.out.println ("GPA: " + gpa);
		
		
		

	}

}
