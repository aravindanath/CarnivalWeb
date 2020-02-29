package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"//TestData//config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("browser"));
		
		
		

	}

}
