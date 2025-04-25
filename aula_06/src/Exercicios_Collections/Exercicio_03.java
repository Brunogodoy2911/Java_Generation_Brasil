package Exercicios_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		Set<Integer> numbers = new HashSet<Integer>();

		System.out.println("|--- Digite 10 valores inteiros NÃO REPETIDOS ---|");

		for (int i = 0; i < 10; i++) {
			System.out.printf("\nDigite o %d° número: ", i);
			int numberSelected = read.nextInt();

			numbers.add(numberSelected);
		}

		Iterator<Integer> iNumeros = numbers.iterator();

		System.out.println("\nListar dados do Set: ");

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		read.close();

	}

}
