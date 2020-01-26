package com.cts;

import java.util.Scanner;

public class InseringArray {

	public static void main(String[] args) {
		int ar[],arr[],size,i,pos,j,element;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array size::");
		
		size=s.nextInt();
		arr=new int[size];
		ar=new int[size+1];
		System.out.println("Enter the Array ELements::");
		for(i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		System.out.println("Eter the podition, new element");
		pos=s.nextInt();
		System.out.println("Enter the element");
		element=s.nextInt();
		j=0;
		if(pos<size) {
			for(i=0;i<size;i++)
			{
				if(i<pos) {
					ar[j]=arr[i];
					j++;
				}
				else if(i==pos) {
					ar[j]=element;
					j++;
				}
				else{
					ar[j]=arr[i];
					j++;
				}
				
				
			}
			System.out.println("after adding element array is ");
			for(i=0;i<size+1;i++)
				System.out.print(ar[i]+" ");
			
		}
		else
			System.out.println("U entered position is out of range");
		
	}

	}


