package Principal; //Quest�o 20
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

	System.out.println("Calcule a medida da sua escada.");
	Scanner nm = new Scanner(System.in); 
	System.out.print("Informe o seu nome:");
	String nome = nm.next(); // Recebe o nome do usu�rio.
	
	Scanner ang = new Scanner(System.in); 
	System.out.print(nome + ", informe o angulo:");
	double angulo = ang.nextDouble(); //Recebe o valor do �ngulo.
	
	Scanner alt = new Scanner(System.in); 
	System.out.print("Informe a altura:");
	double altura = alt.nextDouble(); // Recebe o valor da altura.
	
	double radiano= ((angulo * 3.14) / 180); // Calcula o radiano, ( o valor  do �ngulo vezes 3.14, dividido por 180).
	System.out.println("O radiano �: " + radiano); // Apresenta o valor do radiano.
	
	double escada = (altura / Math.sin(radiano)); //Calcula a medida de uma escada, (altura dividida pelo valor arredondado do radiano).
	System.out.print("A medida da escada �: " + escada);//Apresenta a medida da escada.
	
	}

}