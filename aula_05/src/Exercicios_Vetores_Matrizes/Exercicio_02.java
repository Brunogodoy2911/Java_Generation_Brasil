package Exercicios_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numbers[] = new int[10];

		int sum = 0;
		float average = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Digite um número inteiro: ");
			numbers[i] = read.nextInt();
			sum += numbers[i];
		}

		System.out.print("\nElementos nos índices ímpares: ");
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.print(numbers[i] + " ");
		}

		System.out.print("\nElementos pares: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}

		System.out.print("\nSoma: " + sum);

		average = (float) sum / 10;
		System.out.printf("\nMédia: %.2f", average);

		read.close();
	}

}
