package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada
		System.out.println("PDV");
		System.out.print("Valor Total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto (%): ");
		desconto = teclado.nextDouble();
		//processamento
		totalDesconto = total - ((total*desconto)/100);
		//saida
		System.out.println("Total com Desconto: R$ " + totalDesconto);
		System.out.print("Valor pago em dinheiro: R$ ");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();

		}
}