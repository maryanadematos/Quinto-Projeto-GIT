package estruturaCondicional;

import java.util.Scanner;

public class ExIfcomposto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		if (numero > 0) {
			System.out.println("O número é positivo");
		}
		else if(numero == 0) {
			System.out.println("O número é negativo");
		}
		else {
			System.out.println("O número é negativo");
		}
		ler.close();
	}
}
			
		

