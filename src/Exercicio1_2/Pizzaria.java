package Exercicio1_2;

public class Pizzaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(String factory) {
		switch (factory) {
		case "calabresa":
			return new PizzaCalabresa();
		case "presunto":
			return new PizzaPresunto();
		default:
			return null;
		}

	}


}
