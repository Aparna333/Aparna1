package com.cts;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String name;
		int year;
		boolean flag=true;
		System.out.println("Enter Your Name ");
		name=s.nextLine();
		
		char []ch=name.toCharArray();
		int i,len=ch.length;
		for(i=0;i<len;i++) {
			if((ch[i]>=65 && ch[i]<=90) || (ch[i]>=97 && ch[i]<=122)){
				flag=true;
			}
			else
		         flag = false;
			}
		if(flag)
		{
			
		try {
		     System.out.println("Enter Your Graduation year");
		     year=Integer.parseInt(s.nextLine());
		     System.out.println("My name is "+ name + " And Graduation year is "+ year);
		}
		catch(Exception e) {
			System.out.println("Please ENter Integer Only");
		}
		
	}
		else {
	System.out.println("Please enter your name properly");			
	}
	}

	}

