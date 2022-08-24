package FactoryMethod_3;

public class Losangulo  extends FigurasGeometrica{

	@Override
	public int calcularArea() {
		System.out.println("Calcular area como Losangulo");
		return 5;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um Losangulo");
		
	}

}
