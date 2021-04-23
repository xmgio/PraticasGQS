import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int falta, qtNota = 0, qtReprovados = 0, aux = 0;
		double notaF = 1, maior = 0, menor = 0, soma = 0, media;

		while (notaF > 0) {
			System.out.println("Insira a nota final do aluno: ");
			notaF = input.nextDouble();

			System.out.println("Insira o numero de faltas do aluno: ");
			falta = input.nextInt();

			if (notaF > 0) {
				soma += notaF;
				aux++;

				// Calculando a maior e menor nota
				if (aux == 1) {
					maior = notaF;
					menor = notaF;
				} else if (notaF > maior) {
					maior = notaF;
				} else if (notaF < menor) {
					menor = notaF;
				}

				if (notaF >= 90) {
					qtNota++;
				} else if ((notaF < 70) || (falta >= 20)) {
					qtReprovados++;
				}
			}
		}

		media = soma / aux;

		System.out.println("A quantidade de alunos com a nota final maior ou igual a 90 é: " + qtNota);
		System.out.println("A quantidade de alunos reprovados é " + qtReprovados);
		System.out.println("A maior nota é " + maior + " e a menor nota é " + menor);
		System.out.println("A media da turma é " + media);
	}
}