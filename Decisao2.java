package Familia41;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {

		int op;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n\t -----Faca o dia de algu�m FELIZ----- ");
		System.out.println("\n1 - Bom dia .....Ensolarado ");
		System.out.println("\n2 - Um caf� ");
		System.out.println("\n3 - 10.000 reais na sua conta... ");
		System.out.println("\n4 - 1 litro de a�a� e um doce cupua�u ");
		System.out.println("\n Escolha sua op��o:  ");

		op = leia.nextInt();

		switch (op)

		{
		case 1:
			System.out.println("\n Bom dia...Ensolarado...");
			break;
		case 2:
			System.out.println("\n - Bom dia .....Ensolarado ");
			break;
		case 3:
			System.out.println("\n - Um caf� ");
			break;
		case 4:
			System.out.println("\n - 10.000 reais na sua conta... ");
			break;
		default: //caso ao contrario entra no Default para a op��o a baixo
			System.out.println("Nenhuma op��o escolhida ");

		}

	}

}
