package Familia41;

public class Exemplo_Heranca_Pessoa {
	
	//atributos classe pessoas
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//inicializando atribudos
	
	public Exemplo_Heranca_Pessoa(String nome, String endereco, String cpf,int telefone, int idade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//metodos gets e sets para manipular esses dados criados

	public String getNome() { // metodo get é pegar
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
public void validarCpf()
	
	{
		if(getCpf().length() != 11) // length contar a quantidade de caractere
		{
			
			System.out.println("\n -- CPF Inválido!!!--");
		}
		else
		{
			System.out.println("\n -- CPF válido!!! ");
		}
		
		 // get acesso pegar informação
		// set modificar ele vai inserir informaçõies
	}

}
