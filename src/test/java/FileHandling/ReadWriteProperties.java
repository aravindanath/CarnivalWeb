package FileHandling;

import java.io.IOException;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {

		String val = Genric.getVal("url", "data");
		System.out.println(val);
		Genric.setVal("url", "https://www.amazon.com", "data1");

		String value = Genric.getVal("TC002", "url", "testdata");
		System.out.println(value);

	}

}
