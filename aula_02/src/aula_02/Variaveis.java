package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		
		int soma = numero_01 + numero_02;
		
		char opcao = 'V';
		boolean menorIdade = false;
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		final double PI = 3.1415;
		
		System.out.printf("Variável número 1: %d, + variável número 2: %d é igual a: %d\n", numero_01, numero_02, soma);
		System.out.println("Variável número 2 é igual a: " + numero_02);
		System.out.printf("Constante PI é igual a: %.2f\n", PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
	}

}
