package week3.day1.string;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		
		char[] value=test.toCharArray();
		System.out.println(value);
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<=value.length-1; i++) {
//			System.out.println(value[i]);
			if(i%2!=0) { 
				result.append(Character.toUpperCase(value[i]));			 
				}
			else {
				result.append(Character.toLowerCase(value[i]));		
			}
			
		}
		System.out.println(result.toString());
		
//		System.out.print(value2);
		//Collections.reverseOrder(value);
	}



}
