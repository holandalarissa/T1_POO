package Principal; //Questão 10
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

	System.out.println("Calcule a área do círculo.");
	Scanner nm = new Scanner(System.in); 
	System.out.print("Informe o seu nome:");
	String nome = nm.next(); //nm = nome, recebe o nome do usuário.
	
	Scanner r = new Scanner(System.in);
	System.out.print("Informe o raio:");
	double raio = r.nextDouble(); // r = raio, recebe o valor do raio.
	
	double area = (3.1415 * (raio*raio)); //Calcula a área do círculo, (3.1415 vezes raio elevado ao quadrado).
	System.out.print(nome + ", a área do círculo equivale aproximadamente a: " + Math.round(area)); // Apresenta a área do círculo, obs: Math.round arredonda o valor. 
	}

}
