package br.com.lista4;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorNumero = 0;
		
		for(int i = 0;i < 5;i++) {
			System.out.print("Informe a nota da atividade --> ");
			pontuacao[i] = teclado.nextInt();
			
			if(maiorNumero < pontuacao[i]) {
				 maiorNumero = pontuacao[i];
			}
		}
		
		for(int i = 0;i < 5;i++) {
			System.out.print(" | "+pontuacao[i]);
		}
		System.out.println();
		System.out.println("A maior nota digitada foi --> "+maiorNumero);
		
		
	}

}
