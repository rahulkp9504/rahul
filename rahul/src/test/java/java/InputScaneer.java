package java;

import java.util.Scanner;


public class InputScaneer {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("enter how many number you want add");
		int size= scr.nextInt();
		int [] a= new int [size];
		System.out.println("enter all number one by one");
		for (int i = 0; i < size; i++) {
			a[i]=scr.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
