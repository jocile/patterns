package FactoryMethod_1;

public class FabricaDeCarro {

	public Carro criarCarro(String modelo) {
		switch (modelo) {
		case "celta":
			return new Celta(modelo);
		case "palio":
			return new Palio(modelo);
		case "fiesta":
			return new Fiesta(modelo);
		case "gol":
			return new Gol(modelo);
//		case "ferrari":
//			return new Ferrari(modelo);

		default:
			break;
		}
		return null;
	}

}
