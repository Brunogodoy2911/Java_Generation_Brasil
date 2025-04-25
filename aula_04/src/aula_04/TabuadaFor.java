package aula_04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int number = read.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n %d X %d = %d", number, i, (number * i));
		}

		read.close();

	}

}
