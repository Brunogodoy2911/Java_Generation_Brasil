package Exercicios_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numbers[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int index = -1;

		System.out.println("|----- Jogo: Adivinhe posição do número -----|");

		System.out.println("\nDigite o número que você deseja encontrar: ");
		int numberSelected = read.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numberSelected) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("O número " + numberSelected + " está na posição: " + index);
		} else {
			System.out.println("\nO número " + numberSelected + " não foi encontrado!");
		}

		read.close();

	}

}
