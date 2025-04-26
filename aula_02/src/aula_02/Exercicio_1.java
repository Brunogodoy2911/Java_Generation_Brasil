package aula_02;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("Novo salário é de: %.2f", novoSalario);
	}

}
