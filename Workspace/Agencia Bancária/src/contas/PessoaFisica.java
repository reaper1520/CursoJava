package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Leandro Ramos";
		cc1.saldo = 10000;
		System.out.println("Cliente:" + cc1.cliente);
		cc1.exibirSaldo();
	}
}