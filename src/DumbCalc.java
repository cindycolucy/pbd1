import java.util.Scanner;

public class DumbCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter a number");
		double firstNum = input.nextDouble();
		
		System.out.println ("Enter another number");
		double secondNum = input.nextDouble();
		
		System.out.println ("Enter a third number");
		double thirdNum = input.nextDouble();
		
		double calc = ((firstNum + secondNum + thirdNum)/2);
		System.out.println ("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") / 2 = " + calc);
		
		
		

	}

}
