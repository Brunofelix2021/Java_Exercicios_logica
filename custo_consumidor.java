package Familia41;

import java.util.Scanner;

public class custo_consumidor {

	public static void main(String[] args) {
		
		/*
		O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos
		(aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor

		*/
		
		Scanner leia = new Scanner(System.in);

		double custoFabrica , custoConsumidor;
		
		System.out.println("\n Entre com o custo de f�brica ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * 0.73);
		
		System.out.println("\n Custo do consumidor � de : " + custoConsumidor);
		
		

	}

}
