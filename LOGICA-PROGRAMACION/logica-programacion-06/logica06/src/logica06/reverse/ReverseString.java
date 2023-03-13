package logica06.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	
	public static String reverse(String phrase) {
		
		//List<String> myList = new ArrayList<String>(Arrays.asList(s.split(","))); OTRA OPCIÓN
		List<String> ls = Arrays.asList(phrase.split(""));
		
		Collections.reverse(ls);
		String newPhrase = String.join("", ls);
		return newPhrase;
	}
}
