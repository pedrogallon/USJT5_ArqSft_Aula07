package Exercicio_Singleton01;

public class IncrementalSingletonLazy {
	private static IncrementalSingletonLazy instance;
	private static int count = 0;
	private static int numero;
	
	private IncrementalSingletonLazy() {
		
	}
	public static IncrementalSingletonLazy getInstance() {
		if (instance == null) {
			instance = new IncrementalSingletonLazy();
		}
		numero = ++count;
		return instance;
	}

	@Override
	public String toString() {
		return "IncrementalSingleton [numero=" + numero + "]";
	}
}
