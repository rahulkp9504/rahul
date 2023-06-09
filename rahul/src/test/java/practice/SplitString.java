
package practice;

import java.util.Iterator;

public class SplitString {
	public static void main(String[] args) {
		String sta= "my name is rahul";
		String space=" ";
		String st = sta.toUpperCase();
		System.out.println(st);
		StringBuilder str= new StringBuilder();
		String[] splited = st.split(" ");
		//for (int i = 0; i < splited.length; i++) {
			//str.append(splited[i]);
			//str.append(" ");
		//}
		
		
	
		
		str.append(splited[3]);
		str.append(space);
		str.append(splited[2]);
		str.append(space);
		str.append(splited[0]);
		str.append(space);
		str.append(splited[1]);
		str.append(space);
		System.out.println(str);
		
		
		
	}

}
