package abstractFactory;

public class Siena implements CarroSedan {

	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
	}

	@Override
	public double tamanhoBagagem() {
		// TODO Auto-generated method stub
		return 200;
	}

}
