package pbd;

public class CompareToChallenge {

	public static void main(String[] args) {
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applebee's".compareTo("apple") );

		System.out.print("Comparing \"crap\" with \"apple\" produces ");
		System.out.println( "crap".compareTo("apple") );
		
		System.out.print("Comparing \"Charlie\" with \"Charlie\" produces ");
		System.out.println( "Charlie".compareTo("Charlie") );
		
		System.out.print("Comparing \"Maxwell\" with \"Maxwell\" produces ");
		System.out.println( "Maxwell".compareTo("Maxwell") );
		
		System.out.print("Comparing \"Cindy\" with \"Colucy\" produces ");
		System.out.println( "Cindy".compareTo("Colucy") );
		
		System.out.print("Comparing \"Colucy\" with \"Cindy\" produces ");
		System.out.println( "Colucy".compareTo("Cindy") );
		
		System.out.print("Comparing \"Fallis\" with \"Dunedin\" produces ");
		System.out.println( "Fallis".compareTo("Dunedin") );
		
		System.out.print("Comparing \"Whetstone\" with \"whetstone\" produces ");
		System.out.println( "Whetstone".compareTo("whetstone") );
	
		System.out.print("Comparing \"Whetstone\" with \"Whetstone\" produces ");
		System.out.println( "Whetstone".compareTo("Whetstone") );
		
		System.out.print("Comparing \"Whetstone\" with \"whetstone\" produces ");
		int a = "Whetstone".compareTo("whetstone");
	
	}
	
	

}
