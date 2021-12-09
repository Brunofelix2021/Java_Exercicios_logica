package Familia41;

import java.util.Scanner;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Exercicio_1_condicional {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número : ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número : ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro número : ");
		n3 = leia.nextInt();
		
		
		if (n1 > n2 && n1 > n3)
			
			{
				System.out.println("\nO número maior é " + n1 +"!!!"  );
			}
		else if (n2 > n1 && n2 > n3)
			{
				System.out.println("\nO número maior é  " + n2);
			}
			
		else 
			{
				System.out.println("\nO maior número é " + n3);
			}
	}

}
