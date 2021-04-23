package percentual;

import java.util.Scanner;

public class Percentual {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p4, p5, p7, p12, telespectador;
        int quatro, cinco, sete, doze, paro = 1;
        while (0 < paro) {

            System.out.println("Bem vindo a pesquisa de audiência!");
            System.out.println("Insira o numero dos Telespectadores dos seguintes canais");
            System.out.println("Canal 4: ");
            quatro = input.nextInt();
            System.out.println("Canal 5: ");
            cinco = input.nextInt();
            System.out.println("Canal 7: ");
            sete = input.nextInt();
            System.out.println("Canal 12: ");
            doze = input.nextInt();

            telespectador = doze + sete + cinco + quatro;
            p4 = quatro * 100 / telespectador;
            p5 = quatro * 100 / telespectador;
            p7 = quatro * 100 / telespectador;
            p12 = quatro * 100 / telespectador;
            System.out.println("O percentual de telespectadores assistindo o canal 4 é igual a: " + p4 + "%");
            System.out.println("O percentual de telespectadores assistindo o canal 5 é igual a: " + p5 + "%");
            System.out.println("O percentual de telespectadores assistindo o canal 7 é igual a: " + p7 + "%");
            System.out.println("O percentual de telespectadores assistindo o canal 12 é igual a: " + p12 + "%");

            System.out.println("Insira 0 para parar ou 1 para continuar");
            paro = input.nextInt();
        }

    }

}