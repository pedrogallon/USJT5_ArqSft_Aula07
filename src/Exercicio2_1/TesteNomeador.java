package Exercicio2_1;

public class TesteNomeador {

	public static void main(String[] args) {
		
		NomeadorFactory nf = new NomeadorFactory();
		String nome1 = "Gallon, Pedro";
		String nome2 = "Pedro Gallon";
		
		Nomeador nomeador1 =  nf.getNomeador(nome1);
		nomeador1.receberNome(nome1);
		nomeador1.mostrarNome();
		System.out.println("---------------");
		Nomeador nomeador2 =  nf.getNomeador(nome2);
		nomeador2.receberNome(nome2);
		nomeador2.mostrarNome();
		
		

	}

}
