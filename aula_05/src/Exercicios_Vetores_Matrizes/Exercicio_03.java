package Exercicios_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = leia.nextInt();
			}
		}

		System.out.println("\nElementos da Diagonal Principal: ");
		int somaPrincipal = 0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}

		System.out.println("\nElementos da Diagonal Secundária: ");
		int somaSecundaria = 0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][matriz.length - 1 - i] + " ");
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

		leia.close();
	}

}
