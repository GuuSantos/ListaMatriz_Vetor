package br.com.lista4;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int[][] m1 = new int[3][3];
		int soma = 0, diagonal = 0;
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				System.out.print("Informe a "+(i+1)+"ª linha e a "+(j+1)+"ª coluna da matriz --> ");
				m1[i][j] = teclado.nextInt();
				soma += m1[i][j];
				
				if(i == j) {
					diagonal += m1[i][j];
				}
			}
		}
		System.out.println("\n");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				System.out.print(" | "+m1[i][j]+" | ");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nA soma de todos os números da matriz é --> "+soma);
		System.out.println("\nA soma da diagonal principal da matriz é --> "+diagonal);
			
		
		
		
	}
	
	
	
}
