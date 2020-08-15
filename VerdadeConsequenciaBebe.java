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
			System.out.println("Beba e passe para o próximo, te vejo quando tudo parar de rodar!");
			break;
		case 1:
			System.out.println("Jogador deve dizer a verdade para a pergunta!");
			switch (pergunta) {
			case 0:
				System.out.println("Qual seu maior medo?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 1:
				System.out.println("Qual a razão mais ridícula pelo qual você terminou com alguém?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 2:
				System.out.println("Qual é a mania mais nojenta que você tem?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 3:
				System.out.println("Qual foi a coisa mais ilegal que você já fez?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 4:
				System.out.println("O que você faria se fosse do sexo oposto por uma semana?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 5:
				System.out.println("Quantos dias você já passou sem tomar banho?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 6:
				System.out.println("Você já traiu algum namorado ou namorada?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 7:
				System.out.println("Se você tivesse que beijar um dos jogadores, quem seria?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 8:
				System.out.println("Qual foi a coisa mais estranha que já te deixou excitado(a)?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			case 9:
				System.out.println("Você já mandou a mesma fotografia íntima para duas pessoas ao mesmo tempo?");
				System.out.println("Responda e passe para o próximo desafiante!");
				break;
			}
			break;
		case 2:
			System.out.println("Que comecem os jogos mortais! kkkkkkkkkk");
			System.out.println("Jogador deve pagar o castigo escolhido:");
			switch (castigo) {
			case 0:
				System.out.println("Fale com um sotaque diferente pelo resto do jogo.");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 1:
				System.out.println("Responda os stories de alguém dizendo que a pessoa te deixou excitada.");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 2:
				System.out.println("Deixe que alguém te dê um tapa na cara.");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 3:
				System.out.println("Fingir que está na balada e mostrar como você faria para chegar em um crush");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 4:
				System.out.println("Simular um pedido de casamento muito romântico para alguém da roda");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 5:
				System.out.println("Mostre a última mensagem que você enviou no WhatsApp");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 6:
				System.out.println("Equilibrar um copo cheio na cabeça durante a próxima rodada");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 7:
				System.out.println("Postar um stories dando uma dica como se você fosse uma blogueira famosa");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 8:
				System.out.println("Pedir para um contatinho enviar uma foto da orelha");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			case 9:
				System.out.println("Mostre a última foto sensual foto que você tirou de você mesmo (a) no seu celular");
				System.out.println("Parabéns! Agora passe para a próxima vitima!");
				break;
			}
			break;
		}
	}
}
