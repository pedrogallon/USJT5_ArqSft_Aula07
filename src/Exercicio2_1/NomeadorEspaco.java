package Exercicio2_1;

public class NomeadorEspaco implements Nomeador {
	private Nome nome;
	

	@Override
	public void receberNome(String input) {
		this.nome = new Nome();
		String[] partes = input.split(" ");
		this.nome.setNome(partes[0]);
		String aux = "";
		for (int i = 1; i< partes.length; i++) {
			aux += " "+partes[i];
		}
		this.nome.setSobrenome(aux);
		System.out.println("Criado com Espaco: "+this.nome.toString());
	}

	@Override
	public void mostrarNome() {
		System.out.println (this.nome.getNome()+" "+this.nome.getSobrenome());
	}

}
