package aula_02;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do participante: ");
		float nota_1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota do participante: ");
		float nota_2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota do participante: ");
		float nota_3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota do participante: ");
		float nota_4 = leia.nextFloat();
		
		float mediaDasNotas = (nota_1 + nota_2 + nota_3 + nota_4) /4;
		
		System.out.printf(" Nota 1: %.2f, \n Nota 2: %.2f, \n Nota 3: %.2f, \n Nota 4: %.2f, \n Media final: %.2f", nota_1, nota_2, nota_3, nota_4, mediaDasNotas);
	}

}
