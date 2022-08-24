package FactoryMethod_1;

public class Palio extends Carro{

	public Palio(String modelo) {
		super(modelo);
		this.modelo="(ModeloCarro)" + modelo;
	}

	
}
