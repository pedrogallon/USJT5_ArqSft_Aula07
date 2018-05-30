package Exercicio2_2;

public class TesteProvedor {
	public static void main (String[] args){
		 ProvedorFactory pf = new ProvedorFactory();
		 
		 String senha1 = "";
		 String senha2 = "designpatterns";
		 
		 Provedor provedor1 = pf.getProvedor(senha1);
		 provedor1.printText();
		 System.out.println("------------------");
		 Provedor provedor2 = pf.getProvedor(senha2);
		 provedor2.printText();
	}
}
