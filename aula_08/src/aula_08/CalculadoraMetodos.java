package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int option;
		String name = "Bruno G";

		while (true) {

			System.out.println("\nDigite o primeiro número: ");
			double n1 = read.nextDouble();

			System.out.println("Digite o segundo número: ");
			double n2 = read.nextDouble();

			System.out.println("\n|----- CALCULADORA -----|\n");
			System.out.println("|----- 1 - Somar -----|");
			System.out.println("|----- 2 - Subtrair -----|");
			System.out.println("|----- 3 - Multiplicar -----|");
			System.out.println("|----- 4 - Dividir -----|");
			System.out.println("|----- 0 - Sair -----|");

			System.out.println("\nQual operação matemática você deseja executar: ");
			option = read.nextInt();

			if (option == 0) {
				about(name);
				System.exit(0);
			}

			switch (option) {
			case 1 -> System.out.printf("\n%.2f + %.2f = %.2f", n1, n2, sum(n1, n2));
			case 2 -> System.out.printf("\n%.2f - %.2f = %.2f", n1, n2, subtraction(n1, n2));
			case 3 -> System.out.printf("\n%.2f * %.2f = %.2f", n1, n2, multiply(n1, n2));
			case 4 -> System.out.printf("\n%.2f / %.2f = %.2f", n1, n2, division(n1, n2));
			default -> System.out.println("Opção inválida!");
			}

		}

		// read.close();

	}

	static double sum(double n1, double n2) {
		return n1 + n2;
	}

	static double subtraction(double n1, double n2) {
		return n1 - n2;
	}

	static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	static double division(double n1, double n2) {
		return n1 / n2;
	}

	static void about(String name) {
		System.out.println("\nCalculadora com Métodos\n");
		System.out.println("Feito por " + name + " :)");
	}

}
