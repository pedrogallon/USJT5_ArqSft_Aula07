package Exercicio2_3;

public class TesteLogger {

	public static void main(String[] args) {
		LoggerFactory lf = new LoggerFactory();
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Logger logger1 = lf.getLogger("console");
		logger1.printNumbers(n);
		Logger logger2 = lf.getLogger("arquivo");
		logger2.printNumbers(n);
	}

}
