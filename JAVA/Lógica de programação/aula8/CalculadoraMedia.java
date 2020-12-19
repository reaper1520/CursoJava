package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraMedia {
	/**
	 * @author Jos� de Assis C�lculo da m�dia
	 */

	public static void main(String[] args) {
		// vari�veis
		String nome;
		double nota1, nota2, media;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("======================");
		System.out.println("== C�lculo da m�dia ==");
		System.out.println("======================");
		System.out.println("");
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a nota1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextDouble();
		// processamento
		media = (nota1 + nota2) / 2;
		// sa�da
		System.out.println("Nome: " + nome);
		System.out.println("M�dia: " + formatador.format(media));
		// estrutura de controle condicional
		if (media < 2) {
			System.out.println("REPROVADO");
		} else if (media >= 5){
			System.out.println("APROVADO");
		} else {
			System.out.println("RECUPERA��O");
		}
		teclado.close();
	}

}
