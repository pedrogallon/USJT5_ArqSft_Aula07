package Exercicio_Singleton01;

public class TesteIncremental {
	public static void main(String[] arsgs){
		for (int i = 0; i< 10; i++) {
			Incremental inc = new Incremental();
			System.out.println(inc);
		}
		for (int i = 0; i< 10; i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}
	}
}
