package Familia41;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {

		float n1, n2, n3, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n Entre com a primeira nota: ");
		n1 = leia.nextFloat();

		System.out.println("\n Entre com a segunda nota: ");
		n2 = leia.nextFloat();

		System.out.println("\n Entre com a terceira nota: ");
		n3 = leia.nextFloat();

		media = (n2 + n2 + n3) / 3;

		System.out.printf("\n Média do aluno : %2.2f", media); // printF deixa arredondar depois que colocar o % 2.2f

		if (media >= 7 && media <= 10)

		{
			System.out.println("\nAluno aprovade... ");
		}

		else if (media >= 5 && media < 7)

		{
			System.out.println("\nAlune de Exame....");
		}

		else {
			System.out.println("\nAluno Reprovado....");
		}

	}

}
