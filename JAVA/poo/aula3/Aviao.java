package carros;

public class Aviao extends Carro{
	//atributo
	double envergadura;
	//m�todo
	void aterrizar() {
		System.out.println("Avi�o pousou.");
	}
	//polimorfismo (reescrever o m�todo aterrizar)
	void acelerar() {
		System.out.println("Avi�o decolou.......");
	}
}
