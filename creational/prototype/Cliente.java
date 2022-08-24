package prototype;

public class Cliente {
	public static void main(String[] args) {
		PalioPrototype prototipoPalio = new PalioPrototype();

		prototipoPalio.setValorCompra(500);

		CarroPrototype palioNovo = prototipoPalio.clonar();
		System.out.println(palioNovo.getValorCompra());
		CarroPrototype palioUsado = prototipoPalio.clonar();
		
		CarroPrototype palioSemiNovo = prototipoPalio.clonar();
		palioSemiNovo.setValorCompra(400);
		CarroPrototype siena = palioSemiNovo.clonar();
		System.out.println("siena: " + siena.getValorCompra());
		
		System.out.println(palioNovo.exibirInfo());
		System.out.println(prototipoPalio.exibirInfo());
		System.out.println("palio usado:"+ palioUsado.exibirInfo());
//		System.out.println(palioSemiNovo.exibirInfo());
//	
		
			
	}
}
