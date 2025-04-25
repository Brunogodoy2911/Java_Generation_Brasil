package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int totalEven = 0, totalOdd = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número do intervalo: ", i);
			int number = read.nextInt();

			if (number % 2 == 0) {
				totalEven++;
			} else {
				totalOdd++;
			}
		}

		System.out.printf("\nTotal de números pares: %d", totalEven);
		System.out.printf("\nTotal de números ímpares: %d", totalOdd);
		
		read.close();
	}

}
