package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Bruno G.");
		fila.add("Rafael");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Victor");
		fila.add("Daniel");

		System.out.println(fila);

		fila.remove();

		System.out.println(fila);

		fila.add("Thiago");

		System.out.println(fila);

		System.out.println("\nExibimos o primeiro elemento da fila");

		System.out.println(fila.peek());

		System.out.println(fila);

		System.out.println("\nExibimos e removemos o primeiro elemento da fila");

		System.out.println(fila.poll());

		System.out.println(fila);

		System.out.println("\nO Daniel está na fila? " + fila.contains("Daniel"));

		System.out.println("\nQual é o tamanho da fila? " + fila.size());

		int contador = 0;
		for (var pessoa : fila) {
			contador++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.println("Posição: " + contador);
			}
		}

	}

}
