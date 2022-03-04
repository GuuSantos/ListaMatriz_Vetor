package br.com.lista4;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		int[] dado = new int[10];
		int soma = 0, media = 0, contador = 0;
		for(int i = 0;i < 10;i++) {
			int numeroDado = random.nextInt(6)+1;
			dado[i] = numeroDado;
			soma += dado[i];
			media = soma/10;
			
			if(dado[i] == 6) {
				contador++;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(" | "+dado[i]);
		}
		System.out.println("\nA média aritmética dos números sorteados é --> "+media);
		System.out.println("\nA quantidade de veze que o número 6 foi sorteado é --> "+contador);
	}

}
