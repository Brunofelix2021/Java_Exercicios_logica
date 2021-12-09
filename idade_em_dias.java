package Familia41;

import java.util.Scanner;

public class idade_em_dias {

	public static void main(String[] args) {
		
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		
		Scanner leia = new Scanner(System.in);
		
		int dias, anos, meses, totalDias;
		
		System.out.println("\nDigite sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("\nDigite sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nEscreva sua idade em dia: ");
		dias = leia.nextInt();
		
		totalDias = anos * 365 + meses *30 + dias;
		
		System.out.println("\nA Sua idade em dias é  " + totalDias + "Dias!!! ");
		
		
		

	}

}
