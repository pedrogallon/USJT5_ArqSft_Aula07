package Exercicio_Singleton01;

public class IncrementalSingleton {
	private static IncrementalSingleton instance = new IncrementalSingleton();
	private static int count = 0;
	private static int numero;
	
	
	public static IncrementalSingleton getInstance() {
		numero = ++count;
		return instance;
	}

	@Override
	public String toString() {
		return "IncrementalSingleton [numero=" + numero + "]";
	}
}
