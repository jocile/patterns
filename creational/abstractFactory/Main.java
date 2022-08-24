package abstractFactory;

public class Main {
	public static void main(String[] args) {

		FabricaDeCarro fabrica = new FabricaFiat();

		CarroSedan sedan = fabrica.criarCarroSedan();
		System.out.println(sedan.getClass());
		CarroPopular popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();

		popular.exibirInfoPopular();

		FabricaDeCarro fabricaFord = new FabricaFord();
		CarroSedan sedanFord = fabricaFord.criarCarroSedan();
		sedanFord.exibirInfoSedan();

		System.out.println(sedanFord.getClass());

		CarroPopular popularFord = fabricaFord.criarCarroPopular();

		System.out.println(popularFord.getClass());
		popularFord.exibirInfoPopular();

		
	}

}
