package Exercicios_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite o número que você deseja encontrar: ");
		int numberSelected = read.nextInt();

		if (numbers.contains(numberSelected)) {
			System.out.printf("O número %d está localizado na posição: %d", numberSelected,
					numbers.indexOf(numberSelected));
		} else {
			System.out.printf("O número %d não foi encontrado!", numberSelected);
		}

		read.close();

	}

}
