package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contadoBruno = new Conta();
		contadoBruno.saldo = 100;
		contadoBruno.deposita(50);
		System.out.println(contadoBruno.saldo);

		boolean conseguiuRetirar = contadoBruno.saca(20);
		System.out.println(contadoBruno.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMacerla = new Conta();
		contaDaMacerla.saldo = 1000;
		
		contaDaMacerla.transfere(300 , contadoBruno);
		System.out.println(contaDaMacerla.saldo);
		System.out.println(contadoBruno.saldo);
		
		contadoBruno.titular = "Bruno Felix";
		System.out.println(contadoBruno.titular);
		
		

	}
}
