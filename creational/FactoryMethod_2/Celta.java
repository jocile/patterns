package FactoryMethod_2;

public class Celta extends Carro implements RegrasCriacao  {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Celta\nFabricante: Chevrolet");
	}

}
