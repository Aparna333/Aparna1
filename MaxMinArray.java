package com.cts;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size,arr[],i,min,max;
		System.out.println("Enter Array Size::");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("Enter Array Values::");
		for(i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		min = arr[0];
		
		for(i=0;i<size;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum value is "+ min);
		
		max=arr[0];
		for(i=0;i<size;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("Maximum element is "+ max);	
	}
}
