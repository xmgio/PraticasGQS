package cadastro;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario;
        int idade, sexo, nota, cont = 1;
        String Masculino = "Masculino";
        String Feminino = "Feminino";
        while (0 < cont) {
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            System.out.println("Digite seu salario: ");
            salario = input.nextDouble();
            System.out.printf("\nInforme o sexo (1 para Masculino/2 para Feminino):\n");
            sexo = input.nextInt();

            if (sexo == 1) {
                System.out.println("Seu sexo é: " + Masculino);
                System.out.println("Sua idade é: " + idade);
                System.out.println("Seu salario é: " + salario);
                System.out.println("Digite uma nota de 0 a 10: ");
                nota = input.nextInt();
                System.out.println("Sua nota foi: " + nota);

            } else {
                System.out.println("Seu sexo é: " + Feminino);
                System.out.println("Sua idade é: " + idade);
                System.out.println("Seu salario é: " + salario);
                System.out.println("Digite uma nota de 0 a 10: ");
                nota = input.nextInt();
                System.out.println("Sua nota foi: " + nota);
            }
            cont++;
            System.out.println(cont);
        }

    }

}