package com.cts;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int i,j,size;
		float arr[];
		System.out.println("Enter Size of the float array");
		size=s.nextInt();
		arr=new float[size];
		System.out.println("Enter Array Vlaues");
		for(i=0;i<size;i++)
			arr[i]=s.nextFloat();
		
		for(i=0;i<size;i++) {
			for(j=0;j<=i;j++) {
				if(arr[j]>arr[i]) {
					float temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Sorted Float Array is");
		for(i=0;i<size;i++)
			System.out.print(arr[i]+ " ");
				

	}

}
