package decorator_1;

public class Main {
	public static void main(String[] args) {
		
		Coquetel meuCoquetel = new Cachaca();
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		
		meuCoquetel = new Refrigerante(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		
		System.out.println(meuCoquetel.lista);
	/*	meuCoquetel = new Limao(meuCoquetel);
		
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		System.out.println(meuCoquetel.getClass());
		
		System.out.println(meuCoquetel.lista);
		
		*/
	}
}
