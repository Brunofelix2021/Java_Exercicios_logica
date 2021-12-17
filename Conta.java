package bytebank;

public class Conta {

	double saldo;
	int agencia;
	int numeor;
	String titular;
	

	public void deposita(double valor) {

		this.saldo = this.saldo + valor; // this referencia para esse objeto para essa conta
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor)

		{

			this.saldo = this.saldo - valor;
			return true;
		}

		return false;

	}

	public boolean transfere(double valor, Conta destino)

	{

		if (this.saldo >= valor)

		{
			this.saldo -= valor;
			destino.deposita(valor);
			return true;

		}

		return false;

	}

}
