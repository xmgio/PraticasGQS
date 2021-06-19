import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = 1, mediaF, mediaS, totalS = 0;
		int filhos = 0, i = 0, totalF = 0;

		while (salario > 0) {
			System.out.println("Insira seu salário: ");
			salario = input.nextDouble();

			System.out.println("Insira a quantidade de filhos: ");
			filhos = input.nextInt();

			if (salario > 0) {
				totalS += salario;
				totalF += filhos;

				i++;
			}
		}

		mediaF = totalF / i;
		mediaS = totalS / i;

		System.out.println("A média de filhos é: " + mediaF);
		System.out.println("A média salarial é:  " + mediaS);

	}
}