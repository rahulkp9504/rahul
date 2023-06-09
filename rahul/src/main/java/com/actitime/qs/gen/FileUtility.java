package com.actitime.qs.gen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * this class will be used for file handling/data management
 * @author RAHUL
 *
 */

public class FileUtility {
	/**
	 * this method will be use to read the comman data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public  String  redDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/actitime.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}

}
