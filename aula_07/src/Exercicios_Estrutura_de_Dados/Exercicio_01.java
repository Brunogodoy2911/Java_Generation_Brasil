package Exercicios_Estrutura_de_Dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		Queue<String> customerList = new LinkedList<String>();

		int option = -1;
		String name;

		System.out.println("******************************************************\n");
		System.out.println("	1 - Adicionar Cliente na Fila");
		System.out.println("	2 - Listar todos os Clientes");
		System.out.println("	3 - Retirar Cliente da  Fila");
		System.out.println("	0 - Sair");
		System.out.println("\n******************************************************\n");

		while (option != 0) {
			System.out.println("\nEntre com a opção desejada: ");
			option = read.nextInt();

			switch (option) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				read.nextLine();
				name = read.nextLine().toUpperCase();

				if (customerList.contains(name)) {
					System.out.println("\nEste cliente já esta na fila!");
					break;
				} else {
					customerList.add(name);
					System.out.println("\nFila: ");
					System.out.println(customerList);
					System.out.println("\nCliente adicionado com sucesso!");
					break;
				}

			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(customerList);
				break;
			case 3:
				if (customerList.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					customerList.poll();
					System.out.println("Fila: ");
					System.out.println(customerList);
					System.out.println("\nO Cliente foi Chamado!");
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
