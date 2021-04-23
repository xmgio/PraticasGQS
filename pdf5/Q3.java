import javax.swing.JOptionPane;

public class Numero3 {

	public static void main(String[] args) {
		int num1,num2,lowNum,highNum ;
		 num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		 num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		 lowNum = num1 < num2 ? num1+1: num2+1;
		 highNum = num1 < num2 ? num2 : num1;
		 System.out.printf("Os números entre %d e %d é:\n", num1,num2);
		 for(;lowNum!=highNum; lowNum++)
			 System.out.printf("%d\n",lowNum);
	}	

}