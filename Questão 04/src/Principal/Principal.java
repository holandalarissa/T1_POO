package Principal; //Quest�o 04
import javax.swing.JOptionPane;
public class Principal {
	
	public static void main(String[] args) {
		String msg = "Que tal um aumento de 25%?";
		JOptionPane.showInternalMessageDialog(null, msg);
		int sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu sal�rio antigo:"));
		int salnovo = (sal + sal *25/100);
		String msg1 = "Seu novo sal�rio �:" + salnovo;
		JOptionPane.showInternalMessageDialog(null, msg1);
	}
	
}