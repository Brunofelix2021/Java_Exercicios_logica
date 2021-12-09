package Familia41;

import java.util.Scanner;

public class media_aritimetica {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in); // entrando dados do usuario e colocando na variavel como se fosse o leia do portugol
		
		float nota1 ,nota2, nota3, media;
		
		
		
		System.out.println("\n Entre com a primeira nota?  " );
		nota1 = leia.nextFloat(); //verificando se é um valor float se não for da erro 
		
		System.out.println("\n Entre com a segunda nota?  " );
		nota2 = leia.nextFloat(); // verificando se é um valor float se não for da erro
		
		System.out.println("\n Entre com a terceira nota?  " );
		nota3 = leia.nextFloat(); // verificando se é um valor float se não for da erro
		
		
		media = nota1 + nota2 + nota3 / 3 ;
		
		System.out.println("\n A sua média foi de  :"+ media);
		
		System.out.printf("\nMédia arredondada: %2.2f" , media); // arredondando a media duas casas para direira e para esquerda
	
		


	}

}
