package carros;

import java.util.Random;

public class Carro {
	//atributos
	int ano;
	String cor;
	//construtor
	public Carro() {
		System.out.println("______________________________________");
		//Dica: <ctrl><shift><o> importa automaticamente a classe
		Random gerador = new Random();
		int chassi = gerador.nextInt(100000);
		System.out.println("Chassi: " + chassi);
	}
	//métodos
	void ligar() {
		System.out.println("Motor ligado.......................");
	}
	void desligar() {
		System.out.println("Motor desligado.");
	}
	void acelerar() {
		System.out.println("Vrummmmmmmmmmmmmmmmm");
	}
}
