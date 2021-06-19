package equacao2;

import conta.newpackage.Conta;
import java.util.Scanner;

public class Equacao2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c;
        Conta conta;
        System.out.println("Insira o valor de a: ");
        a = input.nextDouble();

        System.out.println("Insira o valor de b: ");
        b = input.nextDouble();

        System.out.println("Insira o valor de c: ");
        c = input.nextDouble();

        conta = new Conta(a, b, c);
        conta.calculo();

    }
}   

** Classe da refatoração ****                                                                                                                                                                                                                                                                                                  package conta.newpackage;

public class Conta {

    double A, B, C, r, r2, delta;

    public Conta(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public void calculo() {
        delta = Math.pow(B, 2) - 4 * A * C;

        if ((A == 0 && B == 0) && (C != 0)) {
            System.out.println("Coeficientes informados incorretamente");

        } else if (C == 0) {
            System.out.println("Igualdade confirmada: 0 = 0 ");
        }

        if (A == 0 && B != 0) {
            System.out.println("Esta é uma equação do primeiro grau ");
            r = -C / B;
            System.out.println("A raíz da equação de primeiro grau é r = " + r);
            System.exit(0);
        }

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        } else if (delta > 0) {
            System.out.println("Esta equação possui duas raizes reais diferentes");
            r = ((-B + Math.sqrt(delta)) / (2 * A));
            r2 = ((-B - Math.sqrt(delta)) / (2 * A));

            System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
            System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raizes reais iguais");
            r = ((-B + Math.sqrt(delta)) / (2 * A));
            r2 = ((-B - Math.sqrt(delta)) / (2 * A));

            System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
            System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
        }
    }

}