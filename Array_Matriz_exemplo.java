
package Familia41;

import java.util.Scanner;

public class Array_Matriz_exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entre com 9 números e ao final 
		//some apenas os números múltiplos de 3.
		
		int[][] numeros = new int[3][3];
		int somaMultiplo3 = 0,linha,coluna,somaDiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 3 == 0)
				{
					somaMultiplo3 += numeros[linha][coluna];
				}
				if(linha == coluna)
				{
					somaDiagonal += numeros[linha][coluna];
				}
			}
		}
		System.out.println("\nSomatório dos números múltiplos de 3: "+somaMultiplo3);
	}

}

