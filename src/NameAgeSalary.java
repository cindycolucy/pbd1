import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println ("What is your name?");
		String name = input.nextLine();
		System.out.println(name);
		
		System.out.println ("What is your age?");
		int age = input.nextInt();
		System.out.println(age);
		
		System.out.println ("What is your salary?");
		int salary = input.nextInt();
		System.out.println(salary);
		
	}

}
