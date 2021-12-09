package Familia41;

import java.util.Scanner;

public class custo_consumidor {

	public static void main(String[] args) {
		
		/*
		O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
		(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor

		*/
		
		Scanner leia = new Scanner(System.in);

		double custoFabrica , custoConsumidor;
		
		System.out.println("\n Entre com o custo de fábrica ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * 0.73);
		
		System.out.println("\n Custo do consumidor é de : " + custoConsumidor);
		
		

	}

}
