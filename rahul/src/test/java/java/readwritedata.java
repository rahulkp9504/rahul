package java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class readwritedata {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Admin\\Desktop\\file.txt";
		//FileOutputStream fis= new FileOutputStream(path);
		//fis.write('r');
		//fis.close();
		FileInputStream fis= new FileInputStream(path);
		int i = fis.read();
		while (i!=-1) {
			System.out.println((char)i);
			i=fis.read();
		}
	}

}
