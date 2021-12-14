package Familia41;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		
		//Instanciando um objeto da classe automovel
		
		Automovel auto1 = new Automovel("Bruno" ," Camaro","dfg456" ,2021 );
		auto1.ImprimirInfo();
		System.out.println("\n***Transferencia de Proprietário***");
		
		auto1.setNomeProprietario("Brenda Paiva");
		auto1.setPlaca("JESUS100%");
		auto1.ImprimirInfo();

	}

}
