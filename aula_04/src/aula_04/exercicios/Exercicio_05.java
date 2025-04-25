package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int number = 0, result = 0;

		do {
			System.out.println("Digite um número: ");
			number = read.nextInt();

			if (number > 0) {
				result += number;
			}
		} while (number != 0);

		System.out.printf("A soma dos números positivos é: %d", result);

		read.close();
	}

}
