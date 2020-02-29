package FileHandling;

import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		 // Absulote path
		//c://user/arsha/eclipse-workspace/My First Java Project/TestData
		///Users/aravindanathdm/eclipse-workspace/My First Java Project/TestData
		
		String relativePath = System.getProperty("user.dir");

		System.out.println(relativePath);
	}

}
