package com.cts;

import java.util.Scanner;

public class SpringSplit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str=s.nextLine();
		int len=str.length();
		String []newstr=str.split("\\s");
		System.out.println("After splitting the string is");
		for(String nstr:newstr) {
			System.out.println(nstr);
		}
	}

}
