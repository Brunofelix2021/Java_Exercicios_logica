package Familia41;


import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.


public class Exercicio_de_Array_1 {

	public static void main(String[] args)
	{
		
		int linha, coluna, qntMaior10=0;
		int [][]valor = new int[3][3];
	
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com os valores da Matriz: ");
				valor[linha][coluna]= leia.nextInt();
				if (valor[linha][coluna]>10)
				{
					qntMaior10++;
				}
			}
		}

		
		System.out.println("A quantidade de numeros maiores que 10 é de: "+qntMaior10);
		}
	}
