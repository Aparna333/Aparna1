package com.cts;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch;
		int op1,op2 = 0,op3,count=0;
		System.out.println("Are you ready to play quizz (y/n)");
		ch=s.next().charAt(0);
		if(ch== 'y' || ch=='Y') {
			
            System.out.println("Welcome!!!");
			
			System.out.println(" Q1) What is the capital of India ? ");
			System.out.println(" \t \t 1) Delhi");
			System.out.println(" \t \t 2) Mumbai");
			System.out.println(" \t \t 3) Chennai");
			
			op1=s.nextInt();
			
			if(op1==1) {
				System.out.println("That's right!");
				count++;
			}
			else{
				System.out.println("Sorry India Capital is Delhi");
			}
			
			System.out.println(" Q2) Can you store the value 'dog' in a varialble of type int ?");
			System.out.println(" \t \t 1) Yes");
			System.out.println(" \t \t 2) No");
			op2=s.nextInt();
			if(op2==2) {
				System.out.println("That's right!");
				count++;
			}
			else {
				System.out.println("Sorry, 'dog' is a string Ints can store only numbers ");
			}
			System.out.println(" Q3) What is the Result of 9+9/3 ?");
			System.out.println(" \t \t 1) 15");
			System.out.println(" \t \t 2) 6");
			System.out.println(" \t \t 1) 15/3");
			
			op3=s.nextInt();
			if(op3==2) {
				System.out.println("That's Correct !");
				count++;
			}
			else {
				System.out.println("Sorry its Wrong");
			}
			System.out.println("Your Score is "+count+" out of 3");
			System.out.println("Thanks for playing!");
		}	
		else {
			System.out.println("Its Really fun man ,Play once");
			
	}

	}

}
