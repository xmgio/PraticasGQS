package trbalho07;

import java.util.Scanner;

public class Trbalho07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         double DiagonalMaior, diagonalmenor, area;

        System.out.println("Insira a diagonal maior do Losango: ");
        DiagonalMaior = 18;
        System.out.println(DiagonalMaior);
        System.out.println("Insira a diagonal menor do Losango: ");
        diagonalmenor = 6;
        System.out.println(diagonalmenor);
        area=  (DiagonalMaior*diagonalmenor)/2;
        System.out.println("A área do losango é igual a: "+area);
        
        
    }

}