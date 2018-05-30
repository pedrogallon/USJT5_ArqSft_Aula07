package Exercicio2_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProvedorPublico implements Provedor {

	@Override
	public void printText() {
		System.out.println("Texto Publico:");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("info_publica.txt"));
			System.out.println(reader.readLine());
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
