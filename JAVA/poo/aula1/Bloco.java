package minecraft;

public class Bloco {
	//atributos
	int resistencia;
	String textura;
	
	//construtores
	public Bloco() {
		System.out.println("================================");
	}
	
	//m�todos
	void construir() {
		System.out.println("Bloco colocado");
	}
	void minerar() {
		System.out.println("Recursos obtidos");
	}
	void craftar() {
		System.out.println("�tem construido");
	}
}
