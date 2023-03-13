package minutos.main;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;

public class MinutosFin {

	public static void main(String[] args) {
		howMany(getTime());

	}
	
//	String[] dayA = {"lunes", "martes", "miercoles", "jueves", "sabado", "domingo"};
//	List<String> days = Arrays.asList(dayA);
	
	public static List getTime() {
		String week = "lunes martes miercoles jueves viernes sabado domingo";
		Scanner input = new Scanner(System.in);
		String day;
		int hour;
		int minutes;
		while (true) {
			System.out.print("Ingrese un día de la semana sin acentuación: ");
			day = input.next();
			System.out.print("Ingrese la hora en formato de 24hrs: ");
			hour = input.nextInt();
			System.out.print("Ingrese los minutos: ");
			minutes = input.nextInt();
			if(week.contains(day.toLowerCase()) && (hour>= 0 && hour<=23) && (minutes>=0 && minutes<=59)) {
				break;
			} else if((hour>= 0 && hour<=23) && (minutes>=0 && minutes<=59)){
				System.err.println("Por favor ingrese un dia de la semana valido sin acentuación");
			}else if(week.contains(day.toLowerCase()) && (hour>= 0 && hour<=23)){
				System.err.println("Por favor ingrese minutos válidos");
			}
			else {
				System.err.println("Por favor ingrese una hora válida (24hrs)");
			}
		}
		input.close();
		HashMap<String, Integer> days = new HashMap<>();
		days.put("lunes", 0);
		days.put("martes", 1);
		days.put("miercoles",2);
		days.put("jueves", 3);
		days.put("viernes", 4);
		days.put("sabado", 5);
		days.put("domingo", 6);
		
		List<Integer> time = new ArrayList<Integer>();
		
		time.add(days.get(day));
		time.add(hour);
		time.add(minutes);
		
		return time;
		
		
	}
	public static void howMany(List<Integer> time) {
//		1440 minutos en un día, 60 min en una hora
		int min;
		int minA;
		if(time.get(0) > 4) {
			System.out.println("Faltan 0 minutos para el fin de semana");
		}else {
			minA = time.get(0)*1440 + time.get(1)*60 + time.get(2);
			min = 6660 - minA;
			if(min<0) {
				System.out.println("Faltan 0 minutos para el fin de semana");
			}else {
				System.out.println("Faltan " +min+ " minutos para el fin de semana");
			}
		}
		System.out.println(time.get(0));
	}

}
