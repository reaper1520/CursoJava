package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHora {

	public static void main(String[] args) {
		//variáveis
		double remuneracao,custo,hora;
		int cargaHoraria;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora do serviço");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo Operacional: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horaria mensal de trabalho:");
		cargaHoraria = teclado.nextInt();
		//processamento
		hora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
	}

}
