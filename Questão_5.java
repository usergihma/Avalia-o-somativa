package lpa_av_somativa;

import java.util.Scanner;

public class Questão_5 {

	public static void main(String[] args) {//Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in);// Permite a leitura de váriaveis.
		String carro[] = new String[7];//Declara vetor do tipo String.

		for (int i =1; i<7; i++) {//Inicia uma estrutura de repetição que realiza os comandos abaixo 7 vezes;
			System.out.println("Qual carro gostaria de estacionar? ");// Mostra o comando na tela 7 vezes;
			carro[i]= ler.next();//Guarda o valor dado pelo usuário na váriavel "n", do tipo string;

		}

		for (int i=1; i<7; i++) {//Inicia uma estrutura de repetição que realiza os comandos abaixo 7 vezes;
			System.out.println("O carro estacionado na posição " + i + " é :" + carro[i]);//Exibe os valores guardados em "carro" na tela 7 vezes.
		}
		ler.close(); //Encerra o código.

	}

}
