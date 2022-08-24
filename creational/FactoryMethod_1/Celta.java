package FactoryMethod_1;

public class Celta extends Carro {

	public Celta(String modelo) {
		super(modelo);
		this.modelo = "(ModeloCarro)" + modelo;
	}

	public float potenciaTurbo;

}
