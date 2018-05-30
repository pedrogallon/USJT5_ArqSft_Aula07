package Exercicio2_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LoggerFile implements Logger{

	@Override
	public void printNumbers(int[] n) {
		System.out.println("Log por txt (log.txt)");
		try (PrintWriter out = new PrintWriter("log.txt")) {
		    for (int i : n) {
		    	out.println(i);
		    }
		    out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
}
