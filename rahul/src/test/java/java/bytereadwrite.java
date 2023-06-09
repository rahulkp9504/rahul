package java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytereadwrite {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Admin\\Desktop\\file.txt";
		//FileOutputStream fis = new FileOutputStream(path);
		//String name="rahul";
		//byte [] b=name.getBytes();
		//fis.write(b);
		//fis.close();
		FileInputStream fis = new FileInputStream(path);
		int size = fis.available();
		byte []b=new byte[size];
		fis.read(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println((char)b[i]);
		}
	}

}
