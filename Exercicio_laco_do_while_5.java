package Familia41;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class Exercicio_laco_do_while_5 {


	public static void main(String[] args) {
		
	

		        Scanner reader = new Scanner(System.in);

		        int numero, armazenagem = 0;

		        do {
		            System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0): ");
		            numero = reader.nextInt();
		            armazenagem += numero;
		        }
		        while(numero != 0);

		        System.out.println("A soma dos números digitados é: " + armazenagem);

		        reader.close();
		    

		}

	
}

