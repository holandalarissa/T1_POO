package Principal; //Quest�o 10
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

	System.out.println("Calcule a �rea do c�rculo.");
	Scanner nm = new Scanner(System.in); 
	System.out.print("Informe o seu nome:");
	String nome = nm.next(); //nm = nome, recebe o nome do usu�rio.
	
	Scanner r = new Scanner(System.in);
	System.out.print("Informe o raio:");
	double raio = r.nextDouble(); // r = raio, recebe o valor do raio.
	
	double area = (3.1415 * (raio*raio)); //Calcula a �rea do c�rculo, (3.1415 vezes raio elevado ao quadrado).
	System.out.print(nome + ", a �rea do c�rculo equivale aproximadamente a: " + Math.round(area)); // Apresenta a �rea do c�rculo, obs: Math.round arredonda o valor. 
	}

}
