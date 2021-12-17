
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 10;
		int quantidadePessoas = 5;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!!!");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {

				System.out.println("Você não tem 18 mais pode entrar por que esta acompanhando");

			} else {
				System.out.println("Infelizmente não pode entrar");
			}

		}

	}
}
