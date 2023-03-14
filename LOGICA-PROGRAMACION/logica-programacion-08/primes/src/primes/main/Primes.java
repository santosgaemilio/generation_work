package primes.main;

import java.awt.print.Printable;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class Primes {

	public static void main(String[] args) {
		Object[] arr = checkPrime();
		ArrayList arr1 = (ArrayList) arr[0];
		ArrayList arr2 = (ArrayList) arr[1];
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + arr1.get(i));
		}
		System.out.println("***********");
		for (int j = 0; j < 10; j++) {
			System.out.println(j + " - " + arr2.get(j));
		}
		

	}
	

	public static Object[] checkPrime() {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		List<Integer> arr3 = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			arr.add(input.nextInt());
		}
		
		for(int e: arr) {
			
			if(e == 1) {
				arr2.add(e);
			}else {
				int c = 0;
				for(int j = 2; j<((e/2)+1);j++) {
					
					if(e%j == 0) {
						c++;
					}
				}
				if(c== 0) {
					arr3.add(e);
				}else {
					arr2.add(e);
				}
				
			}
			
			
		}
		arr3.addAll(arr2);
		Object[] ar = new Object[2];	
		ar[0] = arr;
		ar[1] = arr3;
		return ar;
		
	}

}
