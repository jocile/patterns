package abstractFactory;

public class Siena implements CarroSedan {

	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena\nF�brica: Fiat\nCategoria:Sedan");
	}

	@Override
	public double tamanhoBagagem() {
		// TODO Auto-generated method stub
		return 200;
	}

}
