
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 10;
		int quantidadePessoas = 5;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!!!");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {

				System.out.println("Voc� n�o tem 18 mais pode entrar por que esta acompanhando");

			} else {
				System.out.println("Infelizmente n�o pode entrar");
			}

		}

	}
}
