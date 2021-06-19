import javax.swing.JOptionPane;

public class Numero4 {

	public static void main(String[] args) throws Exception {
		int num,fat=1;
		 num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		 if(num<0)
			 throw new Exception("O número deve ser positivo");
		 if(num==0) {
			 System.out.printf("o fatorial de %d é:%d\n",num,1);
			 return;
		 }
		 for(;num!=0;num--)
			 fat*=num;
		 System.out.printf("o fatorial de %d é:%d\n",num,fat);
	}

}