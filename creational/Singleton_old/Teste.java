package Singleton_old;

public class Teste {

	public void test(){
		
		Conexao con= Conexao.getInstancia();
		
		System.out.println(con);
		
		ControladorImpressora.getInstancia();
		
	}
}
