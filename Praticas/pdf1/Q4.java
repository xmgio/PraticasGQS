package trbalho07;

import java.util.Scanner;

public class Trbalho07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double catetoOposto, catetoAdjacente, hipotenusa, raiz;
  
        System.out.println("Digite o valor do cateto oposto: ");
        catetoOposto = 5;
        System.out.println( catetoOposto);
        System.out.println("Digite o valor do cateto adjacente: ");
        catetoAdjacente = 12;
        System.out.println(catetoAdjacente);
        hipotenusa=(catetoOposto*catetoOposto)+ (catetoAdjacente*catetoAdjacente); 
        raiz=Math.sqrt (hipotenusa);
        System.out.println("A hipotenusa do seu triângulo é igual a: " +raiz);
    }

}