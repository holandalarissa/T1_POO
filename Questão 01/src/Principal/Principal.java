package Principal; //Questão 1

import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
	System.out.println("Olá, seja bem vindo(a) à calculadora de notas. ");
	Scanner nm = new Scanner(System.in);
	System.out.print("Informe seu nome:");
	String nome = nm.next(); //nm = nome, recebe o nome do usuário.
	
	Scanner n1 = new Scanner(System.in);
	System.out.print(nome + ", informe sua primeira nota:");
	double nota1 = n1.nextDouble(); //n1 = nota1, recebe a primeira nota.
	
	Scanner n2 = new Scanner(System.in);
	System.out.print("Informe sua segunda nota:");
	double nota2 = n2.nextDouble(); //n2 = nota2, recebe a segunda nota.
	
	Scanner n3 = new Scanner(System.in);
	System.out.print("Informe sua terceira nota:");
	double nota3 = n3.nextDouble(); //n3 = nota3, recebe a terceira nota.
	
	Scanner n4 = new Scanner(System.in);
	System.out.print("Agora informe sua quarta nota:");
	double nota4 = n4.nextDouble(); //n4 = nota 4, recebe a quarta nota.
	
	double soma = (nota1 + nota2 + nota3 + nota4); //Soma as quatro notas digitadas pelo usuário.
	double med = (soma / 4); //Faz uma média entre as quatro notas, (soma das notas divido por quatro).

	System.out.println("A soma de suas notas é " + soma + ", e média entre elas é " + med + "!"); //Apresenta a soma e a média entre as notas.
	
	}

}