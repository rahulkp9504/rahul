package java;

import java.io.Serializable;

public class Employee implements Serializable {
	int eid;
	String name;
	Double sal;

	public Employee(int eid,String name,int i) {
		
		this.eid=eid;
		this.name=name;
		this.sal=i;
	}

}
