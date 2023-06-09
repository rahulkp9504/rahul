package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("");
		Properties ps = new Properties();
		ps.load(fis);
		String data = ps.getProperty("ram");
		System.out.println(data);
	}

}
