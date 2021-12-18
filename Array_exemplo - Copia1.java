package Familia41;

import java.util.Scanner;

/*CALCULE A MEDIA DE 4 ALUNOS */

public class Array_exemplo {

	public static void main(String[] args) {
	
			float n1,n2,n3, somaMedia =0, mediaGeral;
			float [] media = new float[4];  // tem que instanciar para criar o array
			int x;
			
			Scanner leia = new Scanner(System.in);
			
			for(x=0 ; x<4; x++)
				
			{
				System.out.println("\nEntre com n1 : ");	
				n1 = leia.nextFloat();
				
				System.out.println("\nEntre com n2 : ");	
				n2 = leia.nextFloat();
				
				System.out.println("\nEntre com n3 : ");	
				n3 = leia.nextFloat();
			
			
			media[x] = (n1+n2+n3) / 3;
			somaMedia += media[x];
			
			}
			
			mediaGeral = somaMedia / 4;
			System.out.printf("\nMédia Geral: %2.2f", mediaGeral); // arredondando 2 casas para direita e esquerda
			
			
			
	}

}
