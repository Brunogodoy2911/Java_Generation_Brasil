package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CalecaoArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Double> numeros = new ArrayList<Double>();

		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(4.0);
		numeros.add(8.0);
		numeros.add(2.0);

		/*
		 * System.out.println("Digite um número real: "); double input =
		 * leia.nextDouble();
		 * 
		 * numeros.add(input);
		 */

		for (var numero : numeros) {
			System.out.println("Numero: " + numero);
		}

		System.out.println("Indice do número 2.0: " + numeros.indexOf(2.0));

		System.out.println("O número 2.0 existe na coleção? " + numeros.contains(2.0));

		System.out.println("Qual valor está armazenado no indice 2? " + numeros.get(2));

		numeros.set(2, 10.0);

		System.out.println("Exibe os dados após a atualização: ");
		numeros.forEach(System.out::println);

		numeros.remove(2);

		System.out.println("Exibe os dados após a exclusão: ");
		numeros.forEach(System.out::println);

		System.out.println("Qual é o tamanho da Coleção? " + numeros.size());

		// numeros.clear();
		System.out.println("A Coleção essta vazia? " + numeros.isEmpty());

		numeros.sort(null);
		System.out.println("Dados ordenados em ordem crescente: ");
		numeros.forEach(System.out::println);

		numeros.sort(Comparator.reverseOrder());
		System.out.println("Dados ordenados em ordem decrescente: ");
		numeros.forEach(System.out::println);

		leia.close();

	}

}
