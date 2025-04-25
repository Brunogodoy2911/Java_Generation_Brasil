package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.add("Biblia Sagrada - Ave Maria");
		pilha.add("Filoteia - São Francisco de Sales");
		pilha.add("Catecismo Romano");
		pilha.add("A História de uma Alma - Santa Teresinha");
		pilha.add("Catecismo São Pio X");
		pilha.add("Confisões - Santo Agostinho");

		pilha.pop();

		System.out.println(pilha);

		pilha.push("Clean Code");

		System.out.println(pilha);

		System.out.println(pilha.peek());

		System.out.println(
				"O Livro Biblia Sagrada - Ave Maria, existe na Pilha? " + pilha.contains("Biblia Sagrada - Ave Maria"));

	}

}
