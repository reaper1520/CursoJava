package Exercicios;

public class VerdadeConsequenciaBebe {

	public static void main(String[] args) {
		// @author Thiago Sobral

		// variaveis
		int sorte = (int) (Math.random() * 3);
		int pergunta = (int) (Math.random() * 10);
		int castigo = (int) (Math.random()*10);
		switch (sorte) {
		case 0:
			System.out.println("Jogador tem que beber!");
			System.out.println("Beba e passe para o pr�ximo, te vejo quando tudo parar de rodar!");
			break;
		case 1:
			System.out.println("Jogador deve dizer a verdade para a pergunta!");
			switch (pergunta) {
			case 0:
				System.out.println("Qual seu maior medo?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 1:
				System.out.println("Qual a raz�o mais rid�cula pelo qual voc� terminou com algu�m?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 2:
				System.out.println("Qual � a mania mais nojenta que voc� tem?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 3:
				System.out.println("Qual foi a coisa mais ilegal que voc� j� fez?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 4:
				System.out.println("O que voc� faria se fosse do sexo oposto por uma semana?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 5:
				System.out.println("Quantos dias voc� j� passou sem tomar banho?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 6:
				System.out.println("Voc� j� traiu algum namorado ou namorada?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 7:
				System.out.println("Se voc� tivesse que beijar um dos jogadores, quem seria?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 8:
				System.out.println("Qual foi a coisa mais estranha que j� te deixou excitado(a)?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			case 9:
				System.out.println("Voc� j� mandou a mesma fotografia �ntima para duas pessoas ao mesmo tempo?");
				System.out.println("Responda e passe para o pr�ximo desafiante!");
				break;
			}
			break;
		case 2:
			System.out.println("Que comecem os jogos mortais! kkkkkkkkkk");
			System.out.println("Jogador deve pagar o castigo escolhido:");
			switch (castigo) {
			case 0:
				System.out.println("Fale com um sotaque diferente pelo resto do jogo.");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 1:
				System.out.println("Responda os stories de algu�m dizendo que a pessoa te deixou excitada.");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 2:
				System.out.println("Deixe que algu�m te d� um tapa na cara.");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 3:
				System.out.println("Fingir que est� na balada e mostrar como voc� faria para chegar em um crush");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 4:
				System.out.println("Simular um pedido de casamento muito rom�ntico para algu�m da roda");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 5:
				System.out.println("Mostre a �ltima mensagem que voc� enviou no WhatsApp");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 6:
				System.out.println("Equilibrar um copo cheio na cabe�a durante a pr�xima rodada");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 7:
				System.out.println("Postar um stories dando uma dica como se voc� fosse uma blogueira famosa");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 8:
				System.out.println("Pedir para um contatinho enviar uma foto da orelha");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			case 9:
				System.out.println("Mostre a �ltima foto sensual foto que voc� tirou de voc� mesmo (a) no seu celular");
				System.out.println("Parab�ns! Agora passe para a pr�xima vitima!");
				break;
			}
			break;
		}
	}
}
