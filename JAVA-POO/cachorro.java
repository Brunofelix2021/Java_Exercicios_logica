package Familia41_POO;

public class cachorro extends Animal {

	public static void main(String[] args) {

		cachorro dog1 = new cachorro();
		dog1.setNome("Lion");
		dog1.setIdade(5);
		dog1.setSom("Auuuu Auuuu");
		dog1.setCorrer("Corre rápdio");
		
		
		System.out.println(dog1.getNome());
		System.out.println(dog1.getIdade());
		System.out.println(dog1.getSom());
		System.out.println(dog1.getCorrer());


	}

}
