package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int age = 0, gender = 0, stack = 0;
		int backend = 0, frontend = 0, mobile = 0, fullStack = 0;
		int mulheresCisTransFrontend = 0, homensCisTransMobile = 0, naoBinariosFullStack = 0;
		int totalRespondentes = 0, totalIdade = 0;

		String continueLoop = "S";

		System.out.println(" |----- PESQUISA INTERNA -----|");

		while (continueLoop.equalsIgnoreCase("S")) {
			System.out.println("\nIdade: ");
			age = read.nextInt();

			System.out.println(
					"\nIdentidade de Gênero: \n1 - Mulher Cis\n2 - Homem Cis\n3 - Não Binário\n4 - Mulher Trans\n5 - Homem Trans\n6 - Outros");
			gender = read.nextInt();

			System.out.println("\nPessoa Desenvolvedora: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
			stack = read.nextInt();

			totalRespondentes++;
			totalIdade += age;

			switch (stack) {
			case 1:
				backend++;
				break;
			case 2:
				frontend++;
				if (gender == 1 || gender == 4) {
					mulheresCisTransFrontend++;
				}
				break;
			case 3:
				mobile++;
				if ((gender == 2 || gender == 5) && age > 40) {
					homensCisTransMobile++;
				}
				break;
			case 4:
				fullStack++;
				if (gender == 3 && age < 30) {
					naoBinariosFullStack++;
				}
				break;
			default:
				System.out.println("Opção de desenvolvedor inválida.");
			}

			System.out.println("\nDeseja continuar a leitura dos dados de um novo colaborador? (S/N)");
			continueLoop = read.next();
		}

		System.out.println("\nResultados da Pesquisa:");

		System.out.printf("Número de pessoas desenvolvedoras Backend: %d\n", backend);
		System.out.printf("Número de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", mulheresCisTransFrontend);
		System.out.printf("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n",
				homensCisTransMobile);
		System.out.printf("Número de Não Binários desenvolvedores FullStack menores de 30 anos: %d\n",
				naoBinariosFullStack);
		System.out.printf("Número total de pessoas que responderam à pesquisa: %d\n", totalRespondentes);

		if (totalRespondentes > 0) {
			double mediaIdade = totalIdade / (double) totalRespondentes;
			System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
		} else {
			System.out.println("Nenhuma pessoa foi registrada.");
		}

		read.close();
	}
}
