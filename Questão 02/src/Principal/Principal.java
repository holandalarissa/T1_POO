package Principal; //Quest�o 02
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		String msg = "Vamos calcular a m�dia de suas notas?" ;
		JOptionPane.showInternalMessageDialog(null, msg);
		
	int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota1: "));
	int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota2: "));
	int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota3: "));
	
	int media = (nota1 + nota2 + nota3)/3;
	String msg1 = "A m�dia das notas �: " + media;
	JOptionPane.showInternalMessageDialog(null, msg1);
	}
}