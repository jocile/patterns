package FactoryMethod_3;

public class Quadrado  extends FigurasGeometrica{

	@Override
	public int calcularArea() {
		System.out.println("Calcular area como quadrado");
		return 20;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um quadrado");
		
	}

	
	
}
