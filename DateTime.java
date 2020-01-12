/* Aparna*/
package com.cts.javaS;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;
	public class MaxMin{
		   public static void main(String args[]) {
				
			List<LocalDate> dates = Arrays.asList(LocalDate.now(), 
					LocalDate.now().minusYears(2),
			
						LocalDate.now().minusMonths(4));
						
			
			LocalDate maxdate = dates.stream()
		              .max( Comparator.comparing( LocalDate::toEpochDay ) )
		              .get();
				 
			
			LocalDate mindate = dates.stream()
		              .min( Comparator.comparing( LocalDate::toEpochDay ) )
		              .get();
				 
			System.out.println("Max Date is: " + maxdate);
			System.out.println("Min Date is: " + mindate);
		   }
		}