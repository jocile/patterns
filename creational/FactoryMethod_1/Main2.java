package FactoryMethod_1;

public class Main2 {

	public static void main(String[] args) {
		
//		Palio p = new Palio("Palio");
//		Gol g= new Gol("Gol");
//		//Ferrari f= new Ferrari("Ferrari");
//		Fiesta fi= new Fiesta("Fiesta");
		
		FabricaDeCarro f = new FabricaDeCarro();
		
		Carro c= f.criarCarro("ferrari");
		
		System.out.println(c);
	}
}
