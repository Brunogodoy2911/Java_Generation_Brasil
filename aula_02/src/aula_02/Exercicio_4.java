package aula_02;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		float n4 = leia.nextFloat();
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.2f", diferenca);
		
	}

}
