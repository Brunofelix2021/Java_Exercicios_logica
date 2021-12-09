package Familia41;

import java.util.Scanner;

public class Segundos_horas_minutos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		
		System.out.println("\nEntre com a duração do evento em segundo: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos - (horas*3600)) / 60;
		segundos = (segundos-(horas*3600) - (minutos));
		
		System.out.println("O tempo do evento terá duração de :  " + horas + " horas  " + minutos + " minutos " + segundos + " segundos ");
		
		
		
		
	
		

	}

}
