import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, r, r2, delta;

		System.out.println("Insira o valor de a ");
		a = input.nextDouble();

		System.out.println("Insira o valor de b ");
		b = input.nextDouble();

		System.out.println("Insira o valor de c ");
		c = input.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if ((a == 0 && b == 0) && (c != 0)) {
			System.out.println("Coeficientes informados incorretamente");

		} else if (c == 0) {
			System.out.println("Igualdade confirmada: 0 = 0 ");
		}

		if (a == 0 && b != 0) {
			System.out.println("Esta é uma equação do primeiro grau ");
			r = -c / b;
			System.out.println("A raíz da equação de primeiro grau é r = " + r);
			System.exit(0);
		}

		if (delta < 0) {
			System.out.println("Esta equação não possui raízes reais");
		} else if (delta > 0) {
			System.out.println("Esta equação possui duas raizes reais diferentes");
			r = ((-b + Math.sqrt(delta)) / (2 * a));
			r2 = ((-b - Math.sqrt(delta)) / (2 * a));

			System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
			System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
		} else if (delta == 0) {
			System.out.println("Esta equação possui duas raizes reais iguais");
			r = ((-b + Math.sqrt(delta)) / (2 * a));
			r2 = ((-b - Math.sqrt(delta)) / (2 * a));

			System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
			System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
		}
	}
}