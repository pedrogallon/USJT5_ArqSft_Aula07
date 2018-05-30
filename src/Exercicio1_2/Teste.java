package Exercicio1_2;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		AbstractPizzaria fabrica = new Pizzaria();
//		Pizza pizza = fabrica.getFactory("calabresa");
//		System.out.println(pizza.fazer());
//		
//		pizza = fabrica.getFactory("presunto");
//		System.out.println(pizza.fazer());
//		
//		
//		fabrica = new Calzonaria();
//		Pizza calzone = fabrica.getFactory("calabresa");
//		System.out.println(calzone.fazer());
//		
//		calzone = fabrica.getFactory("presunto");
//		System.out.println(calzone.fazer());
//		
//		
		

		int d = new Date("04/17/2018").getDay();

		switch (d) {
		case 0:
			System.out.println("--Domingo--");
			break;
		case 1:
			System.out.println("--Segunda--");
			break;
		case 2:
			System.out.println("--Terça--");
			break;
		case 3:
			System.out.println("--Quarta--");
			break;
		case 4:
			System.out.println("--Quinta--");
			break;
		case 5:
			System.out.println("--Sexta--");
			break;
		case 6:
			System.out.println("--Sabado--");
			break;
		}

		if (d == 1 || d == 3 || d == 5) {
			Pizza p = fabrica.getFactory("calabresa");
			System.out.println(p.fazer());
		} else if (d == 2 || d == 4 || d == 6) {
			Pizza p = fabrica.getFactory("presunto");
			System.out.println(p.fazer());

		} else {
			System.out.println("Não estamos atendendo hoje!");
		}
	}

}
