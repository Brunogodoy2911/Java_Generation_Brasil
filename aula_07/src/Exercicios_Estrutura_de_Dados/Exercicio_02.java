package Exercicios_Estrutura_de_Dados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		Stack<String> bookList = new Stack<String>();

		int option = -1;
		String name;

		System.out.println("******************************************************\n");
		System.out.println("	1 - Adicionar Livro na pilha");
		System.out.println("	2 - Listar todos os Livros");
		System.out.println("	3 - Retirar Livro da pilha");
		System.out.println("	0 - Sair");
		System.out.println("\n******************************************************\n");

		while (option != 0) {
			System.out.println("\nEntre com a opção desejada: ");
			option = read.nextInt();

			switch (option) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				read.nextLine();
				name = read.nextLine().toUpperCase();

				if (bookList.contains(name)) {
					System.out.println("\nEste livro já esta na pilha!");
					break;
				} else {
					bookList.push(name);
					System.out.println("\nPilha: ");
					System.out.println(bookList);
					System.out.println("\nLivro adicionado com sucesso!");
					break;
				}

			case 2:
				System.out.println("Lista de Livros na pilha: ");
				System.out.println(bookList);
				break;
			case 3:
				if (bookList.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					bookList.pop();
					System.out.println("Pilha: ");
					System.out.println(bookList);
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;
			default:
				System.out.println("Programa Finalizado!");
				option = 0;
			}
		}

		read.close();
	}

}
