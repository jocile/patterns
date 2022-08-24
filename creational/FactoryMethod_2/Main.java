package FactoryMethod_2;

public class Main {
	
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaDeCarro();
		RegrasCriacao carro1 = fabrica.getCarro(TiposCarro.CELTA);
		carro1.exibirInfo();
		RegrasCriacao carro2 = fabrica.getCarro(TiposCarro.FIESTA);
		carro2.exibirInfo();
		RegrasCriacao carro3 = fabrica.getCarro(TiposCarro.GOL);
		carro3.exibirInfo();
		
		fabrica.getCarro(TiposCarro.FERRARI);
		
		
		}
}
