package Principal; //Questão 04
import javax.swing.JOptionPane;
public class Principal {
	
	public static void main(String[] args) {
		String msg = "Que tal um aumento de 25%?";
		JOptionPane.showInternalMessageDialog(null, msg);
		int sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salário antigo:"));
		int salnovo = (sal + sal *25/100);
		String msg1 = "Seu novo salário é:" + salnovo;
		JOptionPane.showInternalMessageDialog(null, msg1);
	}
	
}