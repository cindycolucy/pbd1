import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println ("What is your weight in pounds?");
		float lbweight = input.nextFloat();
		float kweight = (lbweight / 2.2f);
		
		System.out.println ("What is your height in inches?");
		int inheight = input.nextInt();
		float mheight = (inheight * 0.0254f);
		
		int feet = (inheight / 12);
		float remainder = (inheight % 12f);
		float inches = (remainder);
		float bmi = (kweight / (mheight * mheight));
		
		System.out.println ("Your weight is " + lbweight + " pounds");
		System.out.println ("Your height is " + feet + " feet " + inches + " inches");
		System.out.println ("Your BMI is " + bmi);
		
		
		
		

	}

}
