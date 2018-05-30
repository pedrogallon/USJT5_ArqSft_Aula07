package Exercicio2_2;

public class ProvedorFactory {
	
	public Provedor getProvedor(String senha) {
		if (senha.equals("designpatterns")) {
			return new ProvedorConfidencial();
		}
		else {
			return new ProvedorPublico();
		}
	}
}
