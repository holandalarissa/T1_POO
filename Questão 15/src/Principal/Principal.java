package Principal; //Quest�o 15
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[]args) {
	
	String msg0 = "Veja o valor de um carro.";
	JOptionPane.showInternalMessageDialog(null, msg0);

	int fabrica = Integer.parseInt(JOptionPane.showInputDialog("Digite o pre�o de f�brica:"));
	int lucro = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de lucro do distribuidor:"));
	int imposto = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual do valor dos imposto:"));

	int vld = fabrica*lucro/100; 
	int vli = fabrica*imposto/100;
	int pfinal = fabrica + lucro + imposto;
	String msg1 = "O valor correspondente ao lucro do distribuidor �: " + vld;
	JOptionPane.showInternalMessageDialog(null, msg1);
	
	String msg2 = "O valor correspondente aos impostos �: " + vli;
	JOptionPane.showInternalMessageDialog(null, msg2);
	
	String msg3 = "O pre�o final do ve�culo �: " + pfinal;
	JOptionPane.showInternalMessageDialog(null, msg3);
	
	}
}