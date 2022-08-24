package FactoryMethod_2;

public class FabricaDeCarro {

	public RegrasCriacao getCarro(TiposCarro tipo) {

		switch (tipo) {
		case CELTA:
			return new Celta();
		case PALIO:
			return new Palio();
		case FIESTA:
			return new Fiesta();
		case GOL:
			return new Gol();
		case FERRARI:
			return new Ferrari();

		default:
			return null;
		}

	}

}
