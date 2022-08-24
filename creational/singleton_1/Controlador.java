package Sigleton;

public final class Controlador {

	private  int cota;
	public int usado;
	private static int numeroInstancia;
	
	private static Controlador instancia;
	
	
	private Controlador() {
		cota=10;
		numeroInstancia++;
	}
	
	public static Controlador getInstancia() {
		
		if(numeroInstancia<2)
		    instancia= new Controlador();
		
		return instancia;
	}

	public void imprimir(Pessoa p, int paginas) {

		System.out.println("usado: "+ usado);
		System.out.println("cota: "+ cota);
		
		if (usado + paginas <= cota) {
			usado += paginas;
			System.out.println("Imprimindo ... ");
		} else {
			System.out.println("Sua cota encerrou");
		}

	}
}
