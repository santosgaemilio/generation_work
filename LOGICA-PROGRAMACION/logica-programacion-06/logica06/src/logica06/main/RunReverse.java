package logica06.main;
import java.util.Scanner;

import logica06.reverse.ReverseString;


public class RunReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce la palabra o frase a voltear: ");
		String phrase = input.nextLine();
		input.close();
		System.out.println(ReverseString.reverse(phrase));	
		
	}

}
