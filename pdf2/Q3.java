package imc2;

import java.util.Scanner;

public class Imc2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double imc, altura, peso, altura2;

        System.out.println("Digite seu peso: ");
        peso = 75;
        System.out.println(peso);
        System.out.println("Digite sua altura: ");
        altura = 1.80;
        System.out.println(altura);
        altura2 = altura * altura;
        imc = (peso / altura2);
        System.out.println(imc);
        if (imc <= 20) {
            System.out.println("Você está Abaixo do Peso. ");
        }else if (imc>=20 & imc<=25){
            System.out.println("O seu peso está Normal. ");
        }else if(imc==25 & imc>=30){
            System.out.println("Você está com Sobrepeso. ");
        }else if (imc==30 & imc>=40){
            System.out.println("Você está com Obesidade. ");
        }else  {
            System.out.println("Você está com Obesidade Mórbida");
        }
     
        
    }

}