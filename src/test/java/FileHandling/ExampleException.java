package FileHandling;

public class ExampleException {
	
	public static void main(String[] args) {
		
		System.out.println("Starting,....");
		try {
			String name = null;
			System.out.println("Count of string "+ name.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
		System.out.println("ENding,....");
		
	}

}
