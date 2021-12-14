package Familia41;

import java.util.Scanner;

public class idade_em_anos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int ano, mes, dia, dias;

		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();

		ano = (dias / 365);
		mes = (dias % 365) / 3;
		dia = (dias % 365) % 30;

		System.out.println("\n A sua idade em anos meses e dias é  " + ano + mes + dia);

	}
}
