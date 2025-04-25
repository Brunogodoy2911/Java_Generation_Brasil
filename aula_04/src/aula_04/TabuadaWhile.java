package aula_04;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int i = 1;
		System.out.println("Digite um numero inteiro: ");
		int number = read.nextInt();

		while(i <= 10) {
			System.out.printf("\n %d X %d = %d", number, i, (number * i));
			i++;
		}

		read.close();
	}

}
