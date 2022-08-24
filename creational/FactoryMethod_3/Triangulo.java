package FactoryMethod_3;

public class Triangulo extends FigurasGeometrica {

	@Override
	public int calcularArea() {
		System.out.println("Calcular area como triagulo");
		return 10;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um triagulo");
		
	}

}
