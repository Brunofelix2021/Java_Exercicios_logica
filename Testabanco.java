
public class Testabanco {

	public static void main(String[] args) {
		//criando cliente
		Cliente bruno = new Cliente(); // referenciando ao objeto cliente criado no java
		bruno.nome = "Bruno Felix";  // apenas adcionado valor as variaveis do objeto
		bruno.cpf = "222.222.222-22"; 
		bruno.profissao = "Programador"; 
		
		Conta contaDoBruno = new Conta ();  // referenciando ao objeto conta.java
		contaDoBruno.deposita(100); // depositando valor ao chamar o metodo deposita
		
		contaDoBruno.titular = bruno; // associa o cliente bruno a conta contaDoBruno	
		System.out.println(contaDoBruno.titular.nome);
		System.out.println(contaDoBruno.saldo);
		
 
	

	}

}
