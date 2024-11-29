package week3.day1.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOddWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		
		String count = " ";
		String[] spl = test.split(count);
		
		List<String> uniquewords = new ArrayList<>();
		
		for(int i=0; i<spl.length; i++) {
			if(i%2==1){
				uniquewords.add(spl[i]);
				spl[i] = new StringBuilder(spl[i]).reverse().toString();
			}
			
		}
		System.out.println("Odd Values are "+ uniquewords);
		
		for (String word : spl) {
            System.out.print(word + " ");
        }
		


	}



}
