package FactoryMethod_1;

public class Fiesta extends Carro {

	public Fiesta(String modelo) {
		super(modelo);
		this.modelo = "(ModeloCarro)" + modelo;
	}

}
