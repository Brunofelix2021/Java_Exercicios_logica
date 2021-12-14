package Familia41;

public class Atividade_de_POO_1 {

	public static void main(String[] args) {
		
		Cliente_POO cliente1 = new Cliente_POO(); // criando o objeto
		
		//passando os dados dos atributos
		
		cliente1.nome = "Bruno felix de Souza";
		cliente1.CPF = "111.111.111-11";
		cliente1.Cidade = "São Paulo";
		cliente1.Idade = 26;
		
		//chamando metodos criados
		
		cliente1.Cadastrar();
		cliente1.Comprar();
		
		//exibindo no console as informações
		
		System.out.println("Insera os dados do cliente :");
		System.out.println(cliente1.nome);
		System.out.println(cliente1.CPF);
		System.out.println(cliente1.Cidade);
		System.out.println(cliente1.Idade);
		

		

	}
}