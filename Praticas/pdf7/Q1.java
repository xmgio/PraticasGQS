import java.util.Scanner;
public class PraticaSete {

    static int[][] matriz = new int[5][5];

    public static void main(String[] args) {
        reader();
        printer();
        printerEvenOdd();
        matrizTransposta();
        printer();
        matrizTransposta();
        diagonalTransposta();
        printer();
    }

    public static void reader(){
        for(int i = 0; i < matriz.length; i++) {
            System.out.println("Escreva os 5 valores da " + (i+1) + "º linha");
            for (int ii = 0; ii < matriz.length; ii++) {
                matriz[i][ii] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static void printer(){
        for(int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for(int ii = 0; ii < matriz.length; ii++) {
                System.out.print(matriz[i][ii]);
            }
        }
        System.out.println("");
    }

    public static void printerEvenOdd(){
        System.out.println("");
        for(int i = 0; i < matriz.length; i++){
            for(int ii = 0; ii < matriz.length; ii++){
                if(ii % 2 == 0 && i % 2 != 0){
                    System.out.println("\nO valor " + matriz[i][ii] + " esta numa coluna impar e em uma linha par");
                }
            }
        }
    }

    public static void matrizTransposta(){
        int diferenca = 0;

            for (int i = 0; i < matriz.length; i++) {
                for(int ii = i; ii < matriz.length; ii++){
                    diferenca = matriz[i][ii] - matriz[ii][i];
                    matriz[i][ii] = matriz[ii][i];
                    matriz[ii][i] += diferenca;
                }
            }
    }


    public static void diagonalTransposta(){
        int diferenca=0;

        for(int i = 0; i < matriz.length; i++){
            diferenca = matriz[i][i] - matriz[i][4-i];
            matriz[i][i] = matriz[i][4-i];
            matriz[i][4-i] += diferenca;
        }
    }

}