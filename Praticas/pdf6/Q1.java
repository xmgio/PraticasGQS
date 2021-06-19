package atividade.vetor;

import java.util.Scanner;

public class AtividadeVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vet[] = new int[10];
        int vetS[] = new int[10];
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.format("Digite um número inteiro: ");
            vet[i] = input.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                vetS[i] = vet[i];
                soma = soma + vetS[i];
            }
        }
        System.out.println("A soma dos números pares é igual a: " + soma);
    }
}