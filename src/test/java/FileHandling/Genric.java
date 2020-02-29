package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class Genric {
	
	/**
	 * @author aravindanathdm
	 * @param header
	 * @param key
	 * @param file
	 * @return
	 * @throws IOException 
	 * @throws InvalidFileFormatException 
	 */
	public static String getVal(String header,String key, String file) throws InvalidFileFormatException, IOException {
		String path = System.getProperty("user.dir")+File.separator+"testData"+File.separator+file+".ini";
		FileInputStream fis = new FileInputStream(path);
		Ini ini = new Ini();
		ini.load(fis);
		String value = ini.get(header, key);
		return value;
	}
	
	/**
	 * 
	 * @param header
	 * @param key
	 * @param value
	 * @param file
	 * @throws IOException
	 */
	
	public static void setVal(String header,String key,String value,String file) throws IOException {
		String path = System.getProperty("user.dir")+File.separator+"testData"+File.separator+file+".ini";
		FileInputStream fos = new FileInputStream(path);
		Ini ini = new Ini();
		ini.put(header, key, value);
		ini.store();
		 
	}
	
	
	
	
	/**
	 * @author aravindanathdm
	 * This method is used to get the value from properties file
	 * @param key
	 * @param file
	 * @return
	 * @throws IOException
	 */
	
	public static String getVal(String key,String file) throws IOException {
		String path = System.getProperty("user.dir")+File.separator+"testData"+File.separator+file+".properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value =prop.getProperty(key);
		return value;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @param file
	 * @throws IOException
	 */
	
	public static void setVal(String key,String value,String file) throws IOException {
		String path = System.getProperty("user.dir")+File.separator+"testData"+File.separator+file+".properties";
		FileOutputStream fos = new FileOutputStream(path);
		Properties prop = new Properties();
		prop.setProperty(key, value);
		prop.store(fos, "Writing to properties files..");
	}
	

	
	
	
	
}
