package Familia41;

import java.util.Scanner;
public class Exercicio_Array_3 {
	

	public static void main(String[] args) {
	
		//3- Leia uma matriz 3 x 3, conte e escreva quantos
		//valores maiores que 10 ela possui.
		
		
		
		int [][] numeros = new int [3][3];
		int linha,coluna,maioresQueDez=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha = 0 ;linha <3; linha++)
		{
			for (coluna = 0; coluna <3; coluna++)
				
			{
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] > 10)
					
				{
					
					maioresQueDez += numeros[linha][coluna];
				}
				
				
				
			}
			
			
			System.out.println("\nOs números são :" + maioresQueDez);
		}
		


	}

}
