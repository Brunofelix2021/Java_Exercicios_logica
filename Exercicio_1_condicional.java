package Familia41;

import java.util.Scanner;

/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class Exercicio_1_condicional {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero : ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo n�mero : ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro n�mero : ");
		n3 = leia.nextInt();
		
		
		if (n1 > n2 && n1 > n3)
			
			{
				System.out.println("\nO n�mero maior � " + n1 +"!!!"  );
			}
		else if (n2 > n1 && n2 > n3)
			{
				System.out.println("\nO n�mero maior �  " + n2);
			}
			
		else 
			{
				System.out.println("\nO maior n�mero � " + n3);
			}
	}

}
