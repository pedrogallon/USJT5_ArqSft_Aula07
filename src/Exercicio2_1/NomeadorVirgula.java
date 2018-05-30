package Exercicio2_1;

public class NomeadorVirgula implements Nomeador {
	private Nome nome;
	

	
	@Override
	public void receberNome(String input) {
		this.nome = new Nome();
		String[] partes = input.split(",");
		this.nome.setSobrenome(partes[0]);
		if (partes.length==2) {
			this.nome.setNome(partes[1]);
		}
		System.out.println("Criado com Virgula: "+this.nome.toString());
	}

	@Override
	public void mostrarNome() {
		System.out.println (this.nome.getSobrenome()+", "+this.nome.getNome() );
	}

}
