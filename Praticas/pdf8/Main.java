import java.util.Scanner;

public class Veiculo {

    static Scanner scanner = new Scanner(System.in);
    static String[][] carros;

    public static void main(String[] args) {
        print();
        vectorSpeech();

    }

    public static void print(){
        System.out.println("Quantos carros serao cadastrados?");
        readWelcome();

        for(int i = 0; i < carros.length; i++) {
            System.out.println("Favor informar placa e chassi do " + (i+1) + " carro");
            readPC(i);
        }
    }

    public static void readWelcome(){
        carros = new String[scanner.nextInt()][2];
        scanner.nextLine();
    }

    public static void readPC(int i){
            System.out.print("Placa: ");
            carros[i][0] = scanner.nextLine();
            System.out.print("\nChassi: ");
            carros[i][1] = scanner.nextLine();
        }

    public static void vectorSpeech(){
         for(int i = 0; i < carros.length; i++){
             System.out.println("\nO " + i + " carro tem a placa " + carros[i][0] + " e o chassi " + carros[i][1]);
         }
    }
}