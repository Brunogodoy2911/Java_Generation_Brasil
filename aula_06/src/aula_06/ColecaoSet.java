package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		Set<String> frutas = new HashSet<String>();

		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("maçã");

		System.out.println(frutas);

		for (var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}

		System.out.println("\nMorango existe na coleção? " + frutas.contains("Morango"));

		frutas.remove("Morango");

		Iterator<String> iFrutas = frutas.iterator();

		while (iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}

		ArrayList<String> frutasList = new ArrayList<String>();

		frutasList.addAll(frutas);
		frutasList.sort(null);

		System.out.println("\nExibir os dados do Array List: ");

		frutasList.forEach(System.out::println);

	}

}
