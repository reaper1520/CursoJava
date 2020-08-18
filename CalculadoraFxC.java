package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraFxC {

	public static void main(String[] args) {
		double celsius,fahrenheit;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		System.out.print("Digite a Temperatura em Fahrenheit:");
		fahrenheit = teclado.nextDouble();
		celsius = 5*(fahrenheit-32) / 9;
		System.out.println("==============");
		System.out.println("Temperatura em Celsius:" + formatador.format (celsius));
		teclado.close();		

	}

}
