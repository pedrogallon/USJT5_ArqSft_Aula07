package Exercicio2_1;

public class NomeadorFactory {
		
	public Nomeador getNomeador(String input) {
		if (input.contains(",")) {
			return new NomeadorVirgula();	
		}
		else {
			return new NomeadorEspaco();
		}
	}

}
