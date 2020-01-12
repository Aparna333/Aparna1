/* Aparna*/

package com.cts.javaS;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	private static Object stream;

	public static void main(String args[]) {
		
		Collection<Integer> list = Arrays.asList(1,6,2,8,1,6,3);
		
		//list.stream().peek(System.out::println); 
		list.stream().peek(System.out::println).count(); 
		 
		List<Integer> ds = list.stream().distinct().collect(Collectors.toList());
		 
		System.out.println(ds);
		
		java.util.stream.Stream<String> ps= Arrays.asList("r", "a", "n","d", "e").parallelStream();

		ps.forEach(System.out::println);
		
		List<String> lines = Arrays.asList("spring", "node", "noyong","ammu","node");

        List<String> result = lines.stream()              
                .filter(line -> !"node".equals(line))                
                .collect(Collectors.toList());            
     
           result.forEach(System.out::println);                

	}


	private static Stream of(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return null;
	}

	private Stream parallel() {
		// TODO Auto-generated method stub
		return null;
	}

}
