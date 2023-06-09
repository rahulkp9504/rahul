package java;

import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmpDriver1 {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"rahul",100);
		String path="C:\\Users\\Admin\\Desktop\\file.txt";
		ObjectOutputStream oout = new ObjectOutputStream(path);
		oout.writeObject(e1);
		
	}
	}


