package FileHandling;

public class ExampleException2 {
	
	public static void main(String[] args) {
		
		System.out.println("Starting,....");
		try {
			String ten = "Jyothi";
			int tennum =  Integer.parseInt(ten);
			int nine = 9;
			System.out.println(nine+ten);
			System.out.println(nine+tennum);
 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
		System.out.println("ENding,....");
		
	}

}
