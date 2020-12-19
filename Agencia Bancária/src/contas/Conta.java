package contas;

public class Conta {
	// Atributos
	public String cliente;
	public double saldo;

	// Construtor
	public Conta() {
		System.out.println("___________________");
		System.out.println("Agencia: 2267");
	}

	// Métodos
	public void exibirSaldo() {
		System.out.println("saldo: " + saldo);
	}
}