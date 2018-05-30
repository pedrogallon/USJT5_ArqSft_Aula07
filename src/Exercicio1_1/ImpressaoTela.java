package Exercicio1_1;

import javax.swing.JOptionPane;

public class ImpressaoTela implements ImpressaoFactory {

	@Override
	public void print() {
		System.out.println("Inicianto Impressão por SysOut");
		JOptionPane.showMessageDialog(null,"Hello World");
	}

}
