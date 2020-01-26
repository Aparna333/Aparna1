package com.cts;

import java.util.Scanner;

public class AlphabetUpper {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str;
		System.out.println("Enter the String ");
		str=s.nextLine();
		char []newstr=str.toCharArray();
		int len = str.length();
		for(int i=0;i<len;i=i+2)
		{
			newstr[i]=Character.toUpperCase(newstr[i]);
		}
		
		System.out.println("After Conevrtion the String is");
		//for(int j=0;j<len;j++)
			System.out.print(newstr);
	
	}
		
	}


