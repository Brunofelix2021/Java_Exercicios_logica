package Familia41;

public class Aviao_POO__2 {

	public static void main(String[] args) {
		
		Aviao_POO aviao1 = new Aviao_POO(); // Criando o objeto
		
		aviao1.marca = "Varing"; // passando valores para o atributos da classe
		aviao1.modelo = "737";
		aviao1.ano = "2005";
		aviao1.cia = "Latam";
		
		
		aviao1.decolar();  // invocando metodos
		
		
		// Exibindo informações dos atributos da classe 
		System.out.println(aviao1.marca);
		System.out.println(aviao1.modelo);
		System.out.println(aviao1.ano);
		System.out.println(aviao1.cia);
		
		
		aviao1.pousar(); // invocando metodos
	}

}
