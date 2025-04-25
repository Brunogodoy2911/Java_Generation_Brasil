package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int number = 0;
		float count = 0f, multipleOf3 = 0f;

		do {
			System.out.println("Digite um número: ");
			number = read.nextInt();
			
			if (number != 0 && number % 3 == 0) {
				multipleOf3 += number;
				count++;
			}
			
		} while (number != 0);

		if (count > 0) {
			float average = multipleOf3 / count;
			System.out.printf("\nA média de números múltiplos de 3 é: %.2f\n", average);
		} else {
			System.out.println("\nNenhum número foi digitado.");
		}

		read.close();
	}

}
