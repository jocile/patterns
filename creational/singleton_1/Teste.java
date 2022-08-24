package Sigleton;

public class Teste {

	
	public void teste() {
		Controlador control2= Controlador.getInstancia();
		System.out.println(control2);
		control2.imprimir(new Pessoa(), 5);
		
	}
}
