package Exercicios;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		// variaveis
		double gasolina, alcool;
		// objeto
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("Comparativo entre Alcool e Gasolina");
		System.out.print("Digite o valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		System.out.print("Digite o valor do Alcool: ");
		alcool = teclado.nextDouble();
		teclado.close();
		// processamento
		if (alcool < 0.7 * gasolina) {
			System.out.print("No momento é mais vantajoso abastecer com Álcool!");
		} else
			System.out.print("No momento é mais vantajoso abastercer com Gasolina!");
	}
}
