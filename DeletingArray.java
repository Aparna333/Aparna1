package com.cts;

import java.util.Scanner;

public class DeletingArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size,arr[],i,j,ar[],del;
		System.out.println("Enter the size of an array");
		size=s.nextInt();
		arr=new int[size];
		ar=new int[size-1];
		System.out.println("ENter Array Values");
		for(i=0;i<size;i++)
			arr[i]=s.nextInt();
			
		System.out.println("Enter the position of the element which has to be deleted");
		del=s.nextInt();
		if(del<size) {
		j=0;
		for(i=0;i<size;i++) {
			if(i==del) {
				
			}
			else {
				ar[j]=arr[i];
				j++;
		}
		}
		
		System.out.println("After Deleteing  the element the array is");
		for(i=0;i<size-1;i++)
			System.out.print(ar[i]+ "  ");
		
		}
		else
			System.out.println("youn entered index is greater than size please provide the index currectly");
}

	}


