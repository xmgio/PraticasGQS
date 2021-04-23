package triangulos;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a, b, c;

        System.out.println("Digite o valor os 3 lados do triangulo:");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        if (a == b & b == c) {
            System.out.println("É um triangulo Equilatero");

        } else if (a != b & b == c) {
            System.out.println(" É um tringulo Isoceles");

        } else if (b != c & b == a) {
            System.out.println(" É um tringulo Isoceles");

        } else if (c != a & b == a) {
            System.out.println(" É um tringulo Isoceles");
        } else if (c != a & b != a) {

            System.out.println(" É um tringulo Escaleno");

        }
    }

}