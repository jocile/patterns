package Singleton_old;

public class SingletonExemplo {

	public static void main(String[] args) {
		
		Conexao s1= Conexao.getInstancia();
	    System.out.println("conexao s1"+ s1 );
		
	    Conexao s2= Conexao.getInstancia();
	    System.out.println("conexao s2"+ s2 );
	    
	    Conexao s3= Conexao.getInstancia();
	    System.out.println("conexao s3"+ s3 );
	    Teste t= new Teste();
		System.out.println("teste1");
		t.test();
	
		

	}

}
