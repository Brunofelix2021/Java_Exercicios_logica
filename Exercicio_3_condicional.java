package Familia41;

import java.util.Scanner;

public class Exercicio_3_condicional {
	
/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
 *10-14 infantil
 *15-17 juvenil
 *18-25 adulto*/
	


	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva sua idade por favor:  ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
			
			{
				System.out.println("\n O grupo que voc� se encontra � INFANTIL!!");
			}
		else if (idade >= 15 && idade <= 17)
			
			{
				System.out.println("\nO grupo que voc� se encontra � JUVENIL!!!");
			}
		
		else if (idade >= 18 && idade <= 25)
			
			{
				System.out.println("\nO grupo que voc� se encontra � ADULTO!!!");
			}
		
		else 
			{
				System.out.println("\n n�mero inv�lido , Digite n�meros de 10 a 25!!");
			}
	}

}
