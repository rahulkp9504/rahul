package practice;

import java.util.HashMap;

public class LargestReptingCharacter {
	static char a;
	static char b;
	public static void main(String[] args) {
		String st="kjfafjoffffffhagsiu";
		int largest=0;
		int secondlarge=0;
		
		
		char[] ch= st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = i+1; j < ch.length; j++) {
				b=ch[j];
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			if (largest<count) {
				
			
			secondlarge=largest;
			largest=count;
			if (largest>secondlarge) {
			   a =ch[i];
			}
			else {
				a =b;
			}
			}
		}
		
			
			System.out.println(a +" is largest ");
			
		}
		
	}


