package Exercicios_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		Double[][] notes = new Double[10][4];

		System.out.println("Digite as notas dos participantes: ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("\nNota do %d° aluno na %d° avaliação: ", i + 1, j + 1);
				notes[i][j] = read.nextDouble();
			}
		}

		for (int i = 0; i < 10; i++) {
			double sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += notes[i][j];
			}
			double average = sum / 4;
			System.out.printf("\nMédia do %d° aluno: %.2f", i + 1, average);
		}

		read.close();
	}
}
