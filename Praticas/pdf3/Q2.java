package repetição;

import javax.swing.JOptionPane;

public class Repetição {

    public static void main(String[] args) {
        JOptionPane Input = new JOptionPane(System.in);
        float nota1, nota2, nota3, media;
        int cont=1;
       while(0<cont){
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(" Primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(" Segunda nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(" Terceira nota: "));
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 0 & media < 3) {
            JOptionPane.showMessageDialog(null, " REPROVADO ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);
        } else if (media >= 3 & media < 7) {
            JOptionPane.showMessageDialog(null, " EXAME ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);

        } else if (media >= 7 & media <= 10) {
            JOptionPane.showMessageDialog(null, " APROVADO ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);
        }
       }
    }

}

//

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double comprimento, pi = 3.14, raio, area, volume;
        int cont=1;
        while (0 < cont) {
            System.out.println("Digite o raio da sua circunferência: ");
            raio = input.nextDouble();
            System.out.println(raio);
            comprimento = 2 * pi * raio;
            area = (pi * (raio * raio));
            volume = (0.75 * pi * (raio * raio * raio));
            System.out.println("O comprimento da sua circunferência é igual a: " + comprimento);
            System.out.println("A area da sua circunferência é igual a: " + area);
            System.out.println("O volume da sua circunferência é igual a: " + volume);
        }
    }

}