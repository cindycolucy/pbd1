import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How much do you weigh on earth?");
		int weight = input.nextInt();

		System.out.println(
				"On what planet are you boxing? Please enter: \"Venus, Mars, Jupiter, Saturn, Uranus, or Neptune\"");
		String planet = input.next();
		
		if (planet.equalsIgnoreCase ("Venus")) {
			double venusWeight = (weight * .78);
			System.out.println("You weigh " + venusWeight + " pounds on Venus.");
		} else if (planet.equalsIgnoreCase ("Mars")) {
			double marsWeight = (weight * .39);
			System.out.println("You weigh " + marsWeight + " pounds on Mars.");
		} else if (planet.equalsIgnoreCase ("Jupiter")) {
			double jupiterWeight = (weight * 2.65);
			System.out.println("You weigh " + jupiterWeight + " pounds on Jupiter.");
		} else if (planet.equalsIgnoreCase ("Saturn")) {
			double saturnWeight = (weight * 1.17);
			System.out.println("You weigh " + saturnWeight + " pounds on Saturn.");
		} else if (planet.equalsIgnoreCase ("Uranus")) {
			double uranusWeight = (weight * 1.05);
			System.out.println("You weigh " + uranusWeight + " pounds on Uranus.");
		} else if (planet.equalsIgnoreCase ("Neptune")){
			double neptuneWeight = (weight * 1.23);
			System.out.println("You weigh " + neptuneWeight + " pounds on Neptune.");
		} else 
			System.out.println ("That is not a planet.");
	}
}
