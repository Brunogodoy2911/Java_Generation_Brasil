package Exercicios_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite o número que você deseja encontrar: ");
		int numberSelected = read.nextInt();

		if (numbers.contains(numberSelected)) {
			System.out.printf("O número %d foi encontrado!", numberSelected);
		} else {
			System.out.printf("O número %d não foi encontrado!", numberSelected);
		}

		read.close();

	}

}
