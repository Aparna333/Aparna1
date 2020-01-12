/*Aparna*/
package com.cts.javaS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".*http://.*", Pattern.CASE_INSENSITIVE);  
		  
        Matcher m = p.matcher("This is URL:Http://localhost");  
        boolean matches = m.matches();  
        System.out.println("matches = " + matches);  
        if(m.matches())  
            System.out.println("start : " + m.start()+" End : "+m.end());  

	}

}
