import javax.swing.JOptionPane;
public class Numero1 {

    public static void main(String[] args) {
        int count = 0;
    	for(int i = 0; i<10; i++) {
    		float num = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
    		if(num < 0)
    			count++;
    	}
        System.out.printf("A quantidade de número negativos digitados foi: %d", count);
    }
}