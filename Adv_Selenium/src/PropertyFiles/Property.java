package PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("D:\\propertyfiles.properties");
		Properties p = new Properties();
		p.load(f1);
		String data = p.getProperty("Browser");
		System.out.println(data);
	}
}
