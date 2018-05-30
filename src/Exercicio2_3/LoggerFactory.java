package Exercicio2_3;

public class LoggerFactory {
	public Logger getLogger(String type) {
		if (type.equals("console")) {
			return new LoggerConsole();
		} else {
			return new LoggerFile();
		}
	}
}
