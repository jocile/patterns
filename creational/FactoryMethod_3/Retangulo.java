package FactoryMethod_3;

public class Retangulo extends FigurasGeometrica {

	@Override
	public int calcularArea() {
		System.out.println("Calcular area como retangulo");
		return 20;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um retangulo");
		
	}
}
