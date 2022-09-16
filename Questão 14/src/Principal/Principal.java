package Principal; //Questão 14

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException{
	System.out.println("Descubra sua idade em 2010");
	
	double anoatual, idadeatual, nascimento, idade2010; //declaração das variáveis.
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String nome = "";
	System.out.print("Digite o seu nome: "); // Recebe o nome do usuário
	
	try {
		nome = in.readLine();	
		}catch (IOException e) {
			System.out.println("Error!");
		}
	System.out.print(nome + " digite o ano atual: ");
	anoatual = Double.parseDouble(in.readLine()); //Recebe o ano atual.
	
	System.out.print("Digite o nascimento: ");
	nascimento = Double.parseDouble(in.readLine()); // Recebe a data de nascimento.

	idadeatual=anoatual-nascimento; // Calcula a idade atual do usuário ( ano atual menos a data de nascimento).
	idade2010= 2010-nascimento; // Calcula a idade que o usuário tinha no ano de 2010.
	System.out.println(nome + ", sua idade atual é " + Math.round(idadeatual) + " anos" + ", em 2010 você tinha " + Math.round(idade2010) + " anos.");
	in.close(); // Apresenta para o usuário sua idade atual e sua idade em 2010.
	
	

	}

}
