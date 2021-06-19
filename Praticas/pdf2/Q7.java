package precoproduto;

import javax.swing.JOptionPane;

public class Precoproduto {
    public static void main(String[] args) { 
        int codigo;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: "));
        
        switch (codigo){
          case 1:
            JOptionPane.showMessageDialog(null, "Sapato: R$ 99,99.");
            break;
          case 2:
            JOptionPane.showMessageDialog(null, "Bolsa: R$ 103,89.");
            break;
          case 3:
            JOptionPane.showMessageDialog(null, "Camisa: R$ 49,98.");
            break;
          case 4:
            JOptionPane.showMessageDialog(null, "Calça: R$ 89,72.");
            break;
          case 5:
            JOptionPane.showMessageDialog(null, "Blusa: R$ 97,35.");
            break;
          default:
            JOptionPane.showMessageDialog(null, "Código inválido.");         
        }               
    }    
}