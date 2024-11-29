package week3.day1.inheritance;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length()) {
			System.out.println("Given text1 and text2 is equal and the size is "+text1.length());
		}else {
			System.out.println("Both are mismatch");
		}
		char charArray[] = text1.toCharArray();
		char charArray2[] = text2.toCharArray();

		Arrays.sort(charArray);
		System.out.print(charArray);
		System.out.println();
		
		Arrays.sort(charArray2);
		System.out.print(charArray2);
		System.out.println();
		
		if(Arrays.equals(charArray, charArray2)) {
			System.out.println("The given strings are Anagram");
		}
		else {
			System.out.println("The given strings are not an Anagram.");
		}
		
	}
}
