import java.util.Scanner;

public class AgeWhatIf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");

		String name = input.next();

		System.out.println("Ok, " + name + " what is your age?");

		int age = input.nextInt();

		if (age >= 16) {
			System.out.println("You're old enough to drive.");
		}
		if (age >= 18) {
			System.out.println("You're old enough to vote.");
		}
		if (age >= 21) {
			System.out.println("You're old enough to drink.");
		}

	}
}
