package Familia41;

public class TesteEmpregado {

	public static void main(String[] args) {
	
		Empregado [] lista = new Empregado[3];
		
		lista[0] = new Empregado("Bruno", 10000);
		lista[1] = new Empregado("Scar", 1000000);
		lista[2] = new Empregado("Bru Verrone", 2000000);
		
		for (Empregado roda:lista)
		{
			roda.imprimir();
		}
	
		System.out.println("\n***********************************************");
		for(Empregado roda:lista)
		{
			roda.aumentaSalario(10);
			roda.imprimir();
		}
	}

}
