package Singleton_old;

public class SingletonTeste {

	public static void main(String[] args) {
	
//		ControladorImpressora.getInstancia(); 
//		ControladorImpressora.getInstancia(); 
//		
//		SigletonTeste2 teste2= new SigletonTeste2();
//		teste2.teste();
//		
//		SigletonTeste2 teste;
//		for (int i = 0; i < 100000000; i++) {
//		teste= new SigletonTeste2();
//		    System.out.println("endereço do objeto indice: "+ i + "  -  "+ teste );
//			ControladorImpressora.getInstancia(); 
//		}

		for (int i = 0; i < 110000000; i++) {
     		Conexao.getInstancia();
		}
	}
		

}
