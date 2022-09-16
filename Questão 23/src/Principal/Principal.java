package Principal; //Questão 23
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {

System.out.println("Digite um número e receba sua parte inteira, fracionária e arredondada.");
float real;
int i;
float f, a;

Scanner número= new Scanner(System.in);
System.out.println("Digite um número real: ");

real = número.nextFloat();

i = Math.round(real);
f = real - i;
a = Math.round(real);

System.out.println("A parte interira de " + real + " é: " + i);
System.out.println("A parte fracionária de " + real + " é: " + f);
System.out.println("O arredondamento de " + real + " é: " + a);

	}

}