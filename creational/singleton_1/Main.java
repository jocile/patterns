package Sigleton;

public class Main {

	public static void main(String[] args) {
		
	Pessoa professor = new Pessoa();
	
	Controlador control= Controlador.getInstancia();
	System.out.println(control);
	
	
	Controlador control2= Controlador.getInstancia();
	System.out.println(control2);
	
	Controlador control3= Controlador.getInstancia();
	System.out.println(control3);
	
	Controlador control4= Controlador.getInstancia();
	System.out.println(control4);
	
	
	
	control.imprimir(professor, 5);
	control.imprimir(professor, 5);
	
	Teste t = new Teste();
	t.teste();
	}

}
