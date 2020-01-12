/*Aparna*/
package com.cts.javaS;

import java.util.ArrayList;

public class Vector {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); 
        arr.add(3); 
        arr.add("geeks"); 
        arr.add("forgeeks"); 
        arr.add(4); 
  
        Vector v = new Vector(); 
        v.add(2);
        v.addAll(1,arr); 
  
        // checking vector v 
        System.out.println("vector v:" +v); 
		

	}

	private void add(int i) {
		// TODO Auto-generated method stub
		
	}

	private void addAll(int i, ArrayList arr) {
		// TODO Auto-generated method stub
		
	}

}