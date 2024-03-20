package estruturaCondicional;

import java.util.Scanner;

public class atividadeDesafio {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		double v1, v2,v3, v4,result;

		System.out.println("Informe a primeira nota");
		v1 = ler.nextDouble();
		System.out.println("Informe a segunda nota");
		v2 = ler.nextDouble();
		System.out.println("Informe a terceira nota");
		v3 = ler.nextDouble();
		System.out.println("Informe a quarta nota");
		v4 = ler.nextDouble();
		
		result =(v1+v2+v3+v4)/4;
		
		if(result >=6) {
			System.out.println("vc foi aprovado sua nota é:" + result);

		}

		else {
			System.out.println("que pena você está reprovado:"+ result);

		}
		ler.close();

	}

}


