
import java.util.Scanner;

public class TriviaGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = 0;

		System.out.println("Question 1:");
		System.out.println("What is the capital of Ohio?");
		System.out.println("1. Cincinnati");
		System.out.println("2. Cleveland");
		System.out.println("3. Columbus");

		int answer1 = input.nextInt();
		if (answer1 == 3) {
			n = n + 1;
			System.out.println("Correct answer! Your score is " + n);
		} else {
			System.out.println("Wrong answer! Your score is " + n);
		}

		System.out.println("Question 2:");
		System.out.println("What is the capital of Florida?");
		System.out.println("1. Orlando");
		System.out.println("2. Talahassee");
		System.out.println("3. Jacksonville");

		int answer2 = input.nextInt();
		if (answer2 == 2) {
			n = n + 1;
			System.out.println("Correct answer! Your score is " + n);
		} else {
			System.out.println("Wrong answer! Your score is " + n);
		}

		System.out.println("Question 3:");
		System.out.println("What is the capital of North Carolina?");
		System.out.println("1. Raleigh");
		System.out.println("2. Ashville");
		System.out.println("3. Charlotte");

		int answer3 = input.nextInt();
		if (answer3 == 1) {
			n = n + 1;
			System.out.println("Correct answer! Your score is " + n);
		} else {
			System.out.println("Wrong answer! Your score is " + n);
		}

		System.out.println("Question 4:");
		System.out.println("What is the capital of Calafornia?");
		System.out.println("1. Sacramento");
		System.out.println("2. Los Angeles");
		System.out.println("3. Monterey");

		int answer4 = input.nextInt();
		if (answer4 == 1) {
			n = n + 1;
			System.out.println("Correct answer! Your score is " + n);
		} else {
			System.out.println("Wrong answer! Your score is " + n);
		}
	}

}
