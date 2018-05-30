package Exercicio2_3;

public class LoggerConsole implements Logger {

	@Override
	public void printNumbers(int[] n) {
		System.out.println("Log por console:");
		for (int i : n) {
			System.out.println(i);
		}
		System.out.println("-------------------");
	}

}
