package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int age = 0;
		int lessThan21 = 0;
		int greaterThan50 = 0;
		boolean continueLoop = true;

		while (continueLoop) {
			System.out.println("Digite uma idade: ");
			age = read.nextInt();

			if (age < 21 && age > 0) {
				lessThan21++;
			} else if (age > 51) {
				greaterThan50++;
			}

			if (age < 0) {
				continueLoop = false;

				System.out.printf("\nTotal de pessoas menores de 21 anos: %d", lessThan21);
				System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", greaterThan50);
			}
		}

		read.close();
	}

}
