package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CreateNewFile_Arsha {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String relativePath = System.getProperty("user.dir")+"//TestData//demo.txt";
        System.out.println(relativePath);
        
        File file = new File(relativePath);
        
        if(!file.exists()) {
        	file.createNewFile();
        }else {
        	System.out.println("File is already created!");
        }
        	
        Writer w = new FileWriter(file);
        BufferedWriter bf =  new BufferedWriter(w);
        bf.write("Hello all good morning..");
        bf.newLine();
        bf.write("Happy learning java selenium..");
        bf.flush();
        bf.close();
        
        
	}

}
