package Singleton_old;

public final class ControladorImpressora {

	private static ControladorImpressora instancia;
	private ControladorImpressora(){}
	
		
	public static  ControladorImpressora getInstancia(){
		if(instancia== null) {
			System.out.println("Criou o objeto singleton");
			instancia= new ControladorImpressora();  
		}
		
		System.out.println(instancia);
		return instancia;
	}
	//demais funcionalidades
}




