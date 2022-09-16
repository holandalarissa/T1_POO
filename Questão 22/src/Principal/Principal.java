package Principal; //Questão 22

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {	
	System.out.println("Salário mínimo e a quantidade de quilowatts consumido.");
    double vlrS, qtdKw, vlrKw, vlrR, desc, vlrD; 
    Scanner entrada = new Scanner (System.in);
    System.out.println("Qual é o valor do seu salário Mínimo?");
    vlrS = entrada.nextDouble();
    System.out.println("Qual a quantidade de quilowatt foi consumido na residencia?");
    qtdKw = entrada.nextDouble();
    vlrKw = vlrS/5;
    vlrR = vlrKw*qtdKw;
    desc = vlrR*15/100;
    vlrD = vlrR - desc;
    System.out.println("O valor, em reais, de cada quilowatts é: R$"+ vlrKw);
    System.out.println("O valor, em reais, a ser pago por sua residência é: R$"+ vlrR +". Com o seu consumo de "+ qtdKw);
    System.out.println("Com o desconto de 15%, o valor será de: R$"+ vlrD);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

    		 
    		
    		
    		
	}

}