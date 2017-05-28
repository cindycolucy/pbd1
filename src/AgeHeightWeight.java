import java.util.Scanner;

public class AgeHeightWeight {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int age;
		int feet;
		int inches;
		double weight;

		System.out.print("How old are you? ");
		age = input.nextInt();

		System.out.print("How many feet are you? ");
		feet = input.nextInt();
		
		System.out.print("How many inches are you? ");
		inches = input.nextInt();

		System.out.print("How much do you weigh? ");
		weight = input.nextDouble();

		System.out.println("So you're " + age + " years old, " + feet + " feet " + inches + " inches" + " tall and " + weight + " pounds heavy.");
	}

}
