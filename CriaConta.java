package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo + 500);
		
		primeiraConta.saldo += 100;  // somando + 100 na primeira conta
		System.out.println(primeiraConta.saldo);
	
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta); // mostrando referencia 
	}
}
