package com.cts;

import java.util.Scanner;

public class IntSortArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size,arr[],i,j;
		System.out.println("Enter Your Array Size::");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("Enter Array Values::");
		for(i=0;i<size;i++)
			arr[i]=s.nextInt();

		for(i=0;i<size;i++) {
			for(j=0;j<=i;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}}}
		System.out.println("Sorted Array is ");
		for(i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
		
	}
	}

