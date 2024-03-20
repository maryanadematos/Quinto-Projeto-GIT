package estruturaCondicional;

import java.util.Scanner;

public class Programajava {
	
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	int numero;
	
	System.out.println("informar o dia da semana:");
	numero = ler.nextInt();

	if(numero ==1) { 
		System.out.println("domingo");


	}
	else if(numero == 2) {
		System.out.println("segunda-feira");

	}
	else if(numero == 3) {
		System.out.println("terça-feira");
	}

	else if(numero == 4) {
		System.out.println("quarta-feira");
	}

	else if(numero == 5) {
		System.out.println("quinta-feira");
	}
	
	else if(numero == 6) {
		System.out.println("sexta-feira");
	}
	else if(numero == 7) {
		System.out.println("sabado");
	}
	ler.close();

    }

}
