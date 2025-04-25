package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		int firstNumber = read.nextInt();

		System.out.println("\nDigite o último número do intervalo: ");
		int lastNumber = read.nextInt();

		if (firstNumber > lastNumber) {
			System.out.println("\nIntervalo inválido! O primeiro número deve ser menor do que o último.");
		} else {
			System.out.printf("\nNo Intervalo entre %d e %d: ", firstNumber, lastNumber);

			for (int i = firstNumber; i <= lastNumber; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n%d é múltiplo de 3 e 5\n", i);
				}
			}
		}
		
		read.close();
	}

}
