package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadTextFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		 String relativePath = System.getProperty("user.dir")+"//TestData//demo.txt";
		 Reader r  = new FileReader(relativePath);
		 BufferedReader rd =  new BufferedReader(r);
		 System.out.println(rd.readLine());
		 
		 System.out.println("-----------------------WHILE LOOP---------------------------------");
		 String x ="";
		 int i =1;
		 while((x = rd.readLine())!=null) {
			 System.out.println(i+" "+x);
		 	i++;
		 }
		 rd.close();
	        
	}

}
