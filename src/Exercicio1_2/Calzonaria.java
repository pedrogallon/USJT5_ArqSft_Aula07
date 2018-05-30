package Exercicio1_2;

public class Calzonaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(String factory) {
		switch (factory) {
		case "calabresa":
			return new CalzoneCalabresa();
		case "presunto":
			return new CalzonePresunto();
		default:
			return null;
		}

	}


}
