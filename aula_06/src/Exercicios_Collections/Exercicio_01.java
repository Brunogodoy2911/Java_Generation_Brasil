package Exercicios_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		ArrayList<String> colors = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", i + 1);
			String color = read.nextLine();
			colors.add(color.toUpperCase());
		}

		System.out.println("\nListar todas as cores:");
		for (String color : colors) {
			System.out.println(getColorCode(color) + color + "\u001B[0m");
		}

		System.out.println("\nOrdenar as cores:");
		colors.sort(null);
		for (String color : colors) {
			System.out.println(getColorCode(color) + color + "\u001B[0m");
		}

		read.close();
	}

	// EXTRA
	public static String getColorCode(String color) {
		switch (color) {
			case "VERMELHO":
				return "\u001B[31m";
			case "AZUL":
				return "\u001B[34m";
			case "VERDE":
				return "\u001B[32m";
			case "AMARELO":
				return "\u001B[33m"; 
				case "ROXO":
				return "\u001B[35m";
			case "CIANO":
				return "\u001B[36m";
			default:
				return "\u001B[37m";
		}
	}
}
