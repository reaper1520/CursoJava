package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// vari�veis
		double alcool, gasolina;
		// objetos
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("�lcool x Gasolina");
		System.out.print("Digite o valor do �lcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor do gasolina: ");
		gasolina = teclado.nextDouble();
		// processamento + sa�da
		if (alcool < 0.7 * gasolina) {
			System.out.println("ABASTE�A COM �LCOOL");
		} else {
			System.out.println("ABASTE�A COM GASOLINA");
		}
		teclado.close();
	}

}
