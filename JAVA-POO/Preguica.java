package Familia41_POO;

public class Preguica extends Animal {

	private String SubirArvore;

	public String getSubirArvore() {
		return SubirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		SubirArvore = subirArvore;
	}

	public static void main(String[] args) {

		Preguica preguica1 = new Preguica();

		preguica1.setNome("Bruno");
		preguica1.setIdade(26);
		preguica1.setCorrer("N�o");
		preguica1.setSom("Buaaaaaaa");
		preguica1.setSubirArvore("Sim");

		System.out.println("O nome da pregui�a �  " + preguica1.getNome());
		System.out.println("A Idade �  " + preguica1.getIdade());
		System.out.println("Ela " + preguica1.getCorrer() + "  Corre ");
		System.out.println("O Som que emite �  " + preguica1.getSom());
		System.out.println("Ela sobe em arvore  " + preguica1.getSubirArvore());
	}

}
