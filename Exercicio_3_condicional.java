package Familia41;

import java.util.Scanner;

public class Exercicio_3_condicional {
	
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
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
				System.out.println("\n O grupo que você se encontra é INFANTIL!!");
			}
		else if (idade >= 15 && idade <= 17)
			
			{
				System.out.println("\nO grupo que você se encontra é JUVENIL!!!");
			}
		
		else if (idade >= 18 && idade <= 25)
			
			{
				System.out.println("\nO grupo que você se encontra é ADULTO!!!");
			}
		
		else 
			{
				System.out.println("\n número inválido , Digite números de 10 a 25!!");
			}
	}

}
