package week3.day1.string;

import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String count = " ";
		
		String[] sp = text.split(count);
		
		List<String> uniquewords = new ArrayList<>();

		for(String i: sp ) 
		{
			boolean isDuplicate = false;
			//System.out.print(i);
			
			for(String j: uniquewords) {
				if(j.equalsIgnoreCase(i)) {
					isDuplicate = true;
					break;
				}
				}
			if(!isDuplicate) {
				uniquewords.add(i);
				
			}
			
		}
		for(String word: uniquewords) {
			System.out.print(word+ " ");
		}
	}

}
