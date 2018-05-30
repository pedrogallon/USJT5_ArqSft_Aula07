package Exercicio1_1;


public class Operador {

	public static void main(String[] args) {
		
		if (Math.random()>0.5) {
			ImpressaoTela tela = new ImpressaoTela();
			tela.print();
		}else {
			ImpressaoTxt txt = new ImpressaoTxt();
			txt.print();
		}

	}

}
