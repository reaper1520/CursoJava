package exercicios;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		// variável que aceita um caractere
		// variável de apoio para jogar novamente o dado
		char novoJogo = 'n';
		Scanner teclado = new Scanner(System.in);

		do {
			int dado = (int) (Math.random() * 6 + 1);
			switch (dado) {
			case 1:
				System.out.println("╔═══════╗");
				System.out.println("║       ║");
				System.out.println("║   ○   ║");
				System.out.println("║       ║");
				System.out.println("╚═══════╝");
				break;
			case 2:
				System.out.println("╔═══════╗");
				System.out.println("║ ○     ║");
				System.out.println("║       ║");
				System.out.println("║     ○ ║");
				System.out.println("╚═══════╝");
				break;
			case 3:
				System.out.println("╔═══════╗");
				System.out.println("║ ○     ║");
				System.out.println("║   ○   ║");
				System.out.println("║     ○ ║");
				System.out.println("╚═══════╝");
				break;
			case 4:
				System.out.println("╔═══════╗");
				System.out.println("║ ○   ○ ║");
				System.out.println("║       ║");
				System.out.println("║ ○   ○ ║");
				System.out.println("╚═══════╝");
				break;
			case 5:
				System.out.println("╔═══════╗");
				System.out.println("║ ○   ○ ║");
				System.out.println("║   ○   ║");
				System.out.println("║ ○   ○ ║");
				System.out.println("╚═══════╝");
				break;
			case 6:
				System.out.println("╔═══════╗");
				System.out.println("║ ○   ○ ║");
				System.out.println("║ ○   ○ ║");
				System.out.println("║ ○   ○ ║");
				System.out.println("╚═══════╝");
				break;
			}
			System.out.print("Deseja jogar novamente(s/n)? ");
			novoJogo = teclado.next().charAt(0);
		} while (novoJogo == 's');
		teclado.close();
	}
}