package carros;

public class Garagem {

	public static void main(String[] args) {
		// objeto 1 - Ferrari
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
		// Objeto 2 - Fusca
		Carro fusca = new Carro();
		fusca.ano = 1967;
		fusca.cor = "Azul";
		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
		// Objeto 3 - Camaro
		//Dica: <crtl><shift><f> identação(alinhamento)
		Carro camaro = new Carro();
		camaro.ano = 2009;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		Carro uno = new Carro();
		uno.ano = 1991;
		uno.cor = "Branco";
		System.out.println("Carro: Uno");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		uno.ligar();
		uno.acelerar();
	}
}
