package Exercicio1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImpressaoTxt implements ImpressaoFactory {

	public ImpressaoTxt() {};
	
	@Override
	public void print() {
		System.out.println("Inicianto Impressão por Txt");
		try (PrintWriter out = new PrintWriter("output.txt")) {
		    out.println("Hello World");
		    out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
