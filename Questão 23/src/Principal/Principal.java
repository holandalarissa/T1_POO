package Principal; //Quest�o 23
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {

System.out.println("Digite um n�mero e receba sua parte inteira, fracion�ria e arredondada.");
float real;
int i;
float f, a;

Scanner n�mero= new Scanner(System.in);
System.out.println("Digite um n�mero real: ");

real = n�mero.nextFloat();

i = Math.round(real);
f = real - i;
a = Math.round(real);

System.out.println("A parte interira de " + real + " �: " + i);
System.out.println("A parte fracion�ria de " + real + " �: " + f);
System.out.println("O arredondamento de " + real + " �: " + a);

	}

}