package com.cts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check,it is a palindrome or not");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);
	     // System.out.println(reverse);
	      if (original.equals(reverse))  
	         System.out.println("string/number is a palindrome.");  
	      else  
	         System.out.println("string/number is not a palindrome.");   
	}

}
