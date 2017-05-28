import java.util.Scanner;

public class WeekdayName {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input a weekday number.");

		int weekday = input.nextInt();

		if (weekday == 1) {
			System.out.println("Day is Sunday.");
		}

		else if (weekday == 2) {
			System.out.println("Day is Monday.");
		}

		else if (weekday == 3) {
			System.out.println("Day is Tuesday.");
		}

		else if (weekday == 4) {
			System.out.println("Day is Wednesday.");
		}

		else if (weekday == 5) {
			System.out.println("Day is Thursday.");
		}

		else if (weekday == 6) {
			System.out.println("Day is Friday.");
		}

		else if (weekday == 7) {
			System.out.println("Day is Saturday.");
		}

		
		else {
			System.out.println("Error, not a weekday.");

		}

	}
}
