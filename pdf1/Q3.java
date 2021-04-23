public class Trbalho07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salMinimo, saltotal, salUsuario;
        salMinimo = 1100;
        System.out.println("Digite seu salário: ");
        salUsuario = 12100;
        System.out.println(salUsuario);
        saltotal = salUsuario / salMinimo;
        System.out.println("O seu salário equivale a " + saltotal + " salários mínimos");

    }

}