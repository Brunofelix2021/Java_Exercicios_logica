package Familia41_POO;

import java.util.*;

public class Collections {

	public static void main(String[] args) {

		String item1 = "Relógio";
		String item2 = "Anel";
		String item3 = "Colar";
		String item4 = "Brinco";
		String item5 = "Kit Maquiagem";

		ArrayList<String> objetos = new ArrayList<>(); // Adicionando itens a lista
		objetos.add(item1);
		objetos.add(item2);
		objetos.add(item3);
		objetos.add(item4);
		objetos.add(item5);

		System.out.println(objetos); // imprimindo lista só pelo "objetos"

		objetos.remove(0);
		objetos.remove(4);// Removendo um item da lista

		System.out.println(objetos);
		
	
	}

}
