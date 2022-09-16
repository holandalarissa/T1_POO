package Principal; //Questão 25
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

	System.out.println("Calcule o valor do espetáculo.");
	Scanner nm = new Scanner(System.in); 
	System.out.print("Informe o seu nome:");
	String nome = nm.next(); //nm = nome, recebe o nome do usuário
	
	Scanner ct = new Scanner(System.in); 
	System.out.print(nome + ", informe o custo do seu espetaculo:");
	float custo = ct.nextFloat(); //ct = custo, recebe o custo do espetáculo.
	
	Scanner cvt = new Scanner(System.in); 
	System.out.print("Informe o valor do convite:");
	float convite = cvt.nextFloat(); //cvt = convite, recebe o valor do convite..
	
	float quant = (custo / convite); //quant = calcula a quantidade de convites que devem ser vendidos para que alcance o valor do custo do espetáculo.
	System.out.println("Você deve vender " + Math.round(quant) + " convites para que o custo do seu espetáculo seja alcançado!" ); //obs: math.round arredonda o valor.
	
	float retorno = (convite * Math.round(quant)); // Calcula o retorno que o usuário terá.
	float lucro = (Math.round(retorno - custo)); // Calcula o lucro.

	System.out.println("Seu retorno será de " + Math.round(retorno)+ " reais, e seu lucro será " + Math.round(lucro)+ " reais."); //Apresenta o retorno e o lucro.
	}

}